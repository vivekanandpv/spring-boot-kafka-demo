package com.vivekanandpv.springbootkafkademo.apis;

import com.vivekanandpv.springbootkafkademo.services.SampleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
@RequestMapping("api/v1/sample")
public class SampleApi {
    private final SampleService sampleService;

    public SampleApi(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping
    public ResponseEntity<String> get() {
        sampleService.log(String.format("Received request at: %s", ZonedDateTime.now()));
        return ResponseEntity.ok("Sample: OK");
    }
}
