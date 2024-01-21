package se.mwthinker.cppgenerator;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        String data = "Test data \n123\n456";
        String fileNameInZip = "abc.txt";

        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("test.zip"))) {

            ZipEntry zipEntry = new ZipEntry(fileNameInZip);
            zos.putNextEntry(zipEntry);

            ByteArrayInputStream bais = new ByteArrayInputStream(data.getBytes());
            // one line, able to handle large size?
            //zos.write(bais.readAllBytes());


            // play safe
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bais.read(buffer)) > 0) {
                zos.write(buffer, 0, len);
            }

            zos.closeEntry();
        }

    }
}
