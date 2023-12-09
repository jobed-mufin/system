package com.etopng.merchantservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/merchant/cnp")
public class CNPController {
    private static  final Logger LOGGER = LoggerFactory.getLogger(CNPController.class);

    @PostMapping("ussd")
    public ResponseEntity<String> ussdRequest(@RequestBody String payload){
        LOGGER.info("ussd request processing");
        return null;
    }
    @PostMapping("pay-attitude")
    public ResponseEntity<String> payAttitude(@RequestBody String payload){
        LOGGER.info("pay attitude request processing");
        return null;
    }
    @PostMapping("contactless-transaction")
    public ResponseEntity<String> contactlessTransaction(@RequestBody String payload){
        LOGGER.info("Contactless Transaction request processing");
        return null;
    }
}
