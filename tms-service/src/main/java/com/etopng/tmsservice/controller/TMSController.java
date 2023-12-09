package com.etopng.tmsservice.controller;

import com.etopng.tmsservice.client.MerchantClient;
import com.etopng.tmsservice.model.Terminal;
import com.etopng.tmsservice.repository.TerminalRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/terminal")
@RequiredArgsConstructor
public class TMSController {

    private static final Logger LOGGER
            = LoggerFactory.getLogger(TMSController.class);

//    @Autowired
    private  final TerminalRepository repository;

//    @Autowired
    private  final MerchantClient merchantClient;

    @PostMapping
    public Terminal add(@RequestBody Terminal department) {
        LOGGER.info("terminal add: {}", department);
        return repository.addTerminal(department);
    }

    @GetMapping
    public List<Terminal> findAll() {
        LOGGER.info("terminal find");
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Terminal findById(@PathVariable Long id) {
        LOGGER.info("terminal find: id={}", id);
        return repository.findById(id);
    }

    @GetMapping("/with-merchant")
    public List<Terminal> findAllWithMerchants() {
        LOGGER.info("terminal find");
        List<Terminal> terminals
                = repository.findAll();
        terminals.forEach(terminal ->
                terminal.setMerchants(
                        merchantClient.findByMerchant(terminal.getId())));
        return  terminals;
    }

}
