import java.io.*;
import java.util.*;
import java.util.zip.*;

public class ZipRetrive {
    public static void main(String[] args) {
        try {
            String inFilename = "outfile.zip";
            try (ZipInputStream in = new ZipInputStream(new FileInputStream(inFilename))) {
            }
            try (ZipFile zf = new ZipFile(inFilename)) {
                int a = 0;
                OutputStream out = null;
                byte[] buffer = new byte[1024];

                for (Enumeration<? extends ZipEntry> em = zf.entries(); em.hasMoreElements(); ) {
                    ZipEntry entry = em.nextElement();
                    String outFilename = entry.getName();

                    // Open the output file
                    out = new FileOutputStream(outFilename);

                    // Transfer bytes from the ZIP file to the output file
                    InputStream entryIn = zf.getInputStream(entry);
                    int len;
                    while ((len = entryIn.read(buffer)) > 0) {
                        out.write(buffer, 0, len);
                    }
                    entryIn.close();
                    out.close();
                    a++;
                }

                if (a > 0) {
                    System.out.println("Files Unzipped");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
