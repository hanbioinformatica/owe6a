package HashMap;

import java.io.*;
import java.util.HashMap;

public class Reader {

    static HashMap hm;

    public static void main(String[] args){
        try{
        InputStream inputStream = new FileInputStream("c:\\tmp\\corona_virussen.csv");

            String s = readFromInputStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        hm = new HashMap<String, String>();
    }

    private static String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        return "Hello";
    }
}
