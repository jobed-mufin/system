package com.etopng.merchantservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/merchant/card")
public class CardTransactionController {
    private static final Logger LOGGER
            = LoggerFactory.getLogger(CardTransactionController.class);


    @PostMapping("/purchase")
    public ResponseEntity<String> cardPurchase (@RequestBody String payload){
        LOGGER.info("card purchase");
        return null;
    }
    @GetMapping("/balance")
    public ResponseEntity<String> checkBalance (@RequestBody String payload){
        LOGGER.info("card checking balance");
        return null;
    }
    @PostMapping("/pre-authorise")
    public ResponseEntity<String> preAuthorise (@RequestBody String payload){
        LOGGER.info("card pre authorise");
        return null;
    }

    @PostMapping("/post-authorise")
    public ResponseEntity<String> postAuthorise (@RequestBody String payload){
        LOGGER.info("card post authorise");
        return null;
    }
}
