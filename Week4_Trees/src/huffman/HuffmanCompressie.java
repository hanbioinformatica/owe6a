package huffman;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.BitSet;

/* Generated by Together */
public class HuffmanCompressie {

    private static HuffMannNode rootTree;
    private static boolean stopTraversal = false;
    private static Map mapChar_Bits;
    private static StringBuffer stringBuffer;
    private static BitSet bitSetCompressed;

    /**
     * Put the nodes in a tree
     */
    private static void createHuffMannTree(List listHuffMannNodes) {

        Collections.sort(listHuffMannNodes);

        int sum = ((HuffMannNode) listHuffMannNodes.get(0)).getFrequence() + ((HuffMannNode) listHuffMannNodes.get(1)).getFrequence();

        rootTree = new HuffMannNode('_', sum, (HuffMannNode) listHuffMannNodes.get(1), (HuffMannNode) listHuffMannNodes.get(0));
        ((HuffMannNode) listHuffMannNodes.get(1)).setBitString("0");
        ((HuffMannNode) listHuffMannNodes.get(0)).setBitString("1");

        for (int i = 2; i < listHuffMannNodes.size(); i++) {
            HuffMannNode.addNode(rootTree, (HuffMannNode) listHuffMannNodes.get(i));
        }
        System.out.println("HuffMann tree composed!");
        mapChar_Bits = composeMapWithBits();
        System.out.println("The following values that are present in the Map: " + mapChar_Bits.toString());

    }

    /**
     * Create for each entry in the map a HuffMannNode
     */
    private static List createHuffMannNodes(Map map) {

        List listHuffMannNodes = new ArrayList();
        System.out.println("Number of characters in the map: " + map.size());
        System.out.println("Contents of the map: " + map.toString());

        Iterator ientries = map.entrySet().iterator();
        while (ientries.hasNext()) {
            Map.Entry entry = (Map.Entry) ientries.next();
            char c = ((Character) entry.getKey());
            int f = ((Integer) entry.getValue());
            listHuffMannNodes.add(new HuffMannNode(c, f));
        }
        return listHuffMannNodes;
    }

    private static void readDataFromFile(String naamBestand) {
        BufferedReader in = null;
        String line;
        stringBuffer = new StringBuffer();
        //First read the data out of a file named 'data.txt' 
        try {
            in = new BufferedReader(new FileReader(naamBestand));
            while ((line = in.readLine()) != null) {
                stringBuffer.append(line);
                System.out.println("Read line from file: " + stringBuffer.toString());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }

    }

    /**
     * Returns a map with: key = the character value = the number of times the
     * character is represented in the text
     */
    public static Map initializeMap(StringBuffer buffer) {
        System.out.println("The buffer length: " + buffer.length());
        HashMap map = new HashMap(buffer.length());

        for (int i = 0; i < buffer.length(); i++) {
            Character character = buffer.charAt(i);

            if (map.containsKey(character) == true) {
                //The map already contains this character, count 1 extra
                int count = ((Integer) map.get(character));
                count++;
                //put integer in an Integer object to put it into a map.
                Integer objCount = count;
                map.put(character, objCount);
            } else {//the map did not yet contain the character
                map.put(character, 1);
            }
        }
        return map;
    }

    public static void compressText() {
        bitSetCompressed = new BitSet();
        int intTeller = 0;
        for (int i = 0; i < stringBuffer.length(); i++) {
            char character = stringBuffer.charAt(i);
            String bitString = (String) mapChar_Bits.get(character);
            for (int y = 0; y < bitString.length(); y++) {
                intTeller++;
                if (bitString.charAt(y) == '1') {
                    //next bit of bitset = 1
                    bitSetCompressed.set(intTeller);
                } else {
                    bitSetCompressed.clear(intTeller);
                }

            }
        }

        System.out.println("The compressed BitSet consists of : " + bitSetCompressed.length() + " bits");
        System.out.println("The original text consists of : " + stringBuffer.length() * 8 + " bits");
        System.out.println(bitSetCompressed);
    }

    public static void uncompressText() {
        StringBuilder bitsInString = new StringBuilder();
        for (int i = 1; i < bitSetCompressed.length(); i++) {
            if (bitSetCompressed.get(i) == true) {
                bitsInString.append('1');
            } else {
                bitsInString.append('0');
            }
        }
        String result = HuffMannNode.decodeBitstring(bitsInString.toString(), rootTree);
        System.out.println("The bitstring recomposed to text gives as result: " + result);
    }

    public static Map composeMapWithBits() {
        Map returnWaarde = new HashMap();
        postorderTraversal(returnWaarde);
        return returnWaarde;
    }

    private static void postorderTraversal(Map map) {
        postorderHelper(rootTree, map);
    }

    private static void postorderHelper(HuffMannNode node, Map map) {
        if (node.getLeftSubTreeNode() == null) {
            System.out.println(node.getCharacter() + " is transformed to bitset: " + node.getBitString());
            map.put(node.getCharacter(), node.getBitString());
            return;
        }
        postorderHelper(node.getLeftSubTreeNode(), map);

        postorderHelper(node.getRightSubTreeNode(), map);

    }

    public static StringBuilder getBinaryData() {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i < bitSetCompressed.length(); i++) {
            s.append(bitSetCompressed.get(i) == true ? 1 : 0);
        }
        return s;
    }

    public static void main(String[] args) {

        String currentDir = System.getProperty("user.dir") + File.separator + "Week4_Trees" + File.separator + "src" + File.separator + "huffman" + File.separator;
        String naam = "data.txt";
        System.out.println("Current dir using System:" + currentDir);
        readDataFromFile(currentDir + naam);
        Map map = initializeMap(stringBuffer);
        List listHuffMannNodes = createHuffMannNodes(map);
        createHuffMannTree(listHuffMannNodes);
        compressText();
        System.out.println(getBinaryData());
        uncompressText();
    }
}
