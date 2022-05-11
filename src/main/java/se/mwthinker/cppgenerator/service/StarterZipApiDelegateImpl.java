package se.mwthinker.cppgenerator.service;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import se.mwthinker.openapi.api.StarterZipApiDelegate;

import java.io.*;
import java.util.Optional;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;

@Service
public class StarterZipApiDelegateImpl implements StarterZipApiDelegate {
    private final NativeWebRequest request;

    public StarterZipApiDelegateImpl(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.of(request);
    }

    @Override
    public ResponseEntity<Resource> getStarterZip(String name)  {
        try {
            ByteArrayOutputStream boas = new ByteArrayOutputStream();

            try (ZipOutputStream zos = new ZipOutputStream(boas)) {
                zos.putNextEntry(new ZipEntry("file.txt"));
                zos.write("Hello, World!".getBytes());
                zos.closeEntry();
            }

            InputStream is = new ByteArrayInputStream(boas.toByteArray());
            Resource resource = new InputStreamResource(is);

            return ResponseEntity.ok()
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + "text.zip" + "\"")
                    .body(resource);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return ResponseEntity.internalServerError().build();
    }

}
