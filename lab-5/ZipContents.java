import java.io.*;
import java.util.*;
import java.util.zip.*;

public class ZipContents {
    public static void main(String args[]) {
        try {
            // Open the ZIP file
            try (ZipFile zf = new ZipFile("outfile.zip")) {
                // Enumerate each entry
                Enumeration<? extends ZipEntry> entries = zf.entries();
                while (entries.hasMoreElements()) {
                    // Get the entry name
                    String zipEntryName = entries.nextElement().getName();
                    System.out.println("name: " + zipEntryName);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
