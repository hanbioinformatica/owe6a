package lzw;

/**
 * d.d. 12 december 2018 MvdB Aanpassing om bestand te vinden in src directory
 */
import java.io.*;
import java.util.*;

public class Compress {

    final static int MAX_CODES = 1024;
    final static int BYTE_SIZE = 8;
    final static int EXCESS = 4;
    final static int ALPHA = 256;
    final static int MASK1 = 255;
    final static int MASK2 = 15;
    static int leftOver;
    static boolean bitsLeftOver;
    static BufferedInputStream in;
    static BufferedOutputStream out;

    public static String getPath() {
        return "/home/martijn/IdeaProjects/owe6a/Week5_HashMapSet/src/lzw/";
    }

    private static void setFiles() throws IOException {
        String inputFile, outputFile;
        inputFile = getPath() + "file.txt";
        in = new BufferedInputStream(new FileInputStream(inputFile));
        outputFile = inputFile + ".zzz";
        out = new BufferedOutputStream(new FileOutputStream(outputFile));
    }

    private static void output(int pcode) throws IOException {
        int c, d;
        if (bitsLeftOver) {
            d = pcode & MASK1;
            c = (leftOver << EXCESS) + (pcode >> BYTE_SIZE);
            out.write(c);
            out.write(d);
            bitsLeftOver = false;
        } else {
            leftOver = pcode & MASK2;
            c = pcode >> EXCESS;
            out.write(c);
            bitsLeftOver = true;
        }
    }

    private static void compress() throws IOException {
        Map table = new HashMap();
        for (int i = 0; i < ALPHA; i++) {
            table.put(i, i);
        }
        int codeUsed = ALPHA;
        int c = in.read();
        if (c != -1) {
            int pcode = c;
            c = in.read();
            while (c != -1) {
                int k = (pcode << BYTE_SIZE) + c;
                Integer e = (Integer) table.get(k);
                if (e == null) {
                    output(pcode);
                    if (codeUsed < MAX_CODES) {
                        table.put((pcode << BYTE_SIZE) + c, codeUsed++);
                    }
                    pcode = c;
                } else {
                    pcode = e;
                }
                c = in.read();
            }

            output(pcode);
            if (bitsLeftOver) {
                out.write(leftOver << EXCESS);
            }
        }
        in.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        setFiles();
        compress();
    }
}
