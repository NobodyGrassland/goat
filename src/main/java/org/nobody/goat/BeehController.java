package org.nobody.goat;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class BeehController {
    @RequestMapping(value = "/v3", method = RequestMethod.GET)
    public ResponseEntity<String> hello() {
        return new ResponseEntity<String>("Hi there", HttpStatus.OK);
    }
}
