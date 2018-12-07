package simplechecksum;


/**
 * Martijn van der Bruggen
 * @version 10 december 2018
 * 
 * Instituut Toegepaste Biologie en Chemie
 * Bio-informatica
 * 
 * Aanpassing aan checksum voor drosoph.nt.gz van 
 * ftp://ftp.ncbi.nlm.nih.gov/blast/db/FASTA/
 * 
 */

import java.io.*;
import java.security.MessageDigest;



public class MD5ChecksumFile {

    public static byte[] createChecksum(String filename) throws Exception {
        InputStream fis = new FileInputStream(filename);

        byte[] buffer = new byte[1024];
        MessageDigest complete = MessageDigest.getInstance("MD5");
        int numRead;
        do {
            numRead = fis.read(buffer);
            if (numRead > 0) {
                complete.update(buffer, 0, numRead);
            }
        } while (numRead != -1);
        fis.close();
        return complete.digest();
    }

    public static String getPath(){
    String currentDir = System.getProperty("user.dir") + File.separator + "src" + File.separator + "simplechecksum" + File.separator;
        String naam = "drosoph.nt.gz";
        System.out.println("Current dir using System:" + currentDir);
        return currentDir+naam;   
    }
    
    // see this How-to for a faster way to convert
    // a byte array to a HEX string
    public static String getMD5Checksum(String filename) throws Exception {
        byte[] b = createChecksum(filename);
        String result = "";
        for (int i = 0; i < b.length; i++) {
            result += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
        }
        return result;
    }

    public static void main(String args[]) {
        try {
            String bestandsnaam = getPath();
            System.out.println(bestandsnaam);
            System.out.println(getMD5Checksum(bestandsnaam));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
