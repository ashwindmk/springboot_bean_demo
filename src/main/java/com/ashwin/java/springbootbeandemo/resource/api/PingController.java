package com.ashwin.java.springbootbeandemo.resource.api;

import org.apache.commons.io.FilenameUtils;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

@RestController
@RequestMapping("/ping")
public class PingController {
    @GetMapping
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("pong");
    }

    @GetMapping("/file")
    public ResponseEntity<String> file() throws MalformedURLException, URISyntaxException {
        // HTTPS -> S3
        String url = "https://wk-test-static-files.s3-ap-southeast-1.amazonaws.com/311c48b3/009ad02f-5335-43ee-a7b3-1e91d4d58992.jpg?x=1&y=10";
        URI inputUri = new URI(url);
        URI u = new URIBuilder(url)
                .setScheme("s3")
                .setHost("wk-test-static-files")
                .build();
        System.out.println("S3 URI: " + u);
//        System.out.println("URL File: " + u.getFile());
//        System.out.println("URL Path: " + u.getPath());
//        System.out.println("URL Host: " + u.getHost());
//        System.out.println("URL Auth: " + u.getAuthority());
//        System.out.println("URL Proto: " + u.getProtocol());
//        System.out.println("URL Query: " + u.getQuery());
//        System.out.println("URL Ref: " + u.getRef());
        String file = FilenameUtils.getName(u.getPath());
//        System.out.println("File: " + file);

        // Replace host: www.webengage.com

        // S3 -> HTTPS
        String s3 = "s3://" + "folder" + "/liccode/prg/" + "mystupidfile.png" + "?y=1&z=100";
        System.out.println("S3 uri: " + s3);

        URI s3Url = new URI(s3);
//        System.out.println("S3 Prot: " + s3Url.getScheme());
//        System.out.println("S3 Host: " + s3Url.getHost());
//        System.out.println("S3 Path: " + s3Url.getPath());
//        String cUrl = u.getProtocol() + "://" + u.getHost() + s3Url.getPath();
        URI outputUri = new URIBuilder(s3)
                .setScheme(inputUri.getScheme())
                .setHost(inputUri.getHost())
                .build();
        System.out.println("Output uri: " + outputUri.toString());

        return ResponseEntity.ok(file);
    }
}
