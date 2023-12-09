package com.etopng.merchantservice.controller;

import com.etopng.merchantservice.model.Merchant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.etopng.merchantservice.repository.MerchantRepository;

import java.util.List;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
    private static final Logger LOGGER
            = LoggerFactory.getLogger(MerchantController.class);

    @Autowired
    MerchantRepository repository;

    @PostMapping
    public Merchant add(@RequestBody Merchant merchant) {
        LOGGER.info("Merchant add: {}", merchant);
        return repository.add(merchant);
    }

    @GetMapping
    public List<Merchant> findAll() {
        LOGGER.info("Merchant find");
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Merchant findById(@PathVariable("id") String id) {
        LOGGER.info("Merchant find: id={}", id);
        return repository.findById(id);
    }

    @GetMapping("/terminals/{merchantId}")
    public List<Merchant> findByDepartment(@PathVariable("merchantId") String tid) {
        LOGGER.info("Merchant find: departmentId={}", tid);
        return repository.findByTerminal(tid);
    }

}
