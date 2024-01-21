package se.mwthinker.cppgenerator.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import se.mwthinker.openapi.api.PackagesApiDelegate;
import se.mwthinker.openapi.model.GetPackages200Response;


import java.util.List;
import java.util.Optional;

@Service
public class PackagesApiDelegateImpl implements PackagesApiDelegate {
    private final NativeWebRequest request;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.of(request);
    }

    public PackagesApiDelegateImpl(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public ResponseEntity<GetPackages200Response> getPackages(String name, List<String> platforms) {
        return PackagesApiDelegate.super.getPackages(name, platforms);
    }
}
