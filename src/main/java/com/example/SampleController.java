package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ahn on 2017. 4. 5..
 */
@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @GetMapping("/members")
    public ResponseEntity<?> getMembers() {
        return new ResponseEntity<>(sampleService.getMembers(), HttpStatus.OK);
    }

}
