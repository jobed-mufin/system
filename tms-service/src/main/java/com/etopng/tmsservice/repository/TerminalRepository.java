package com.etopng.tmsservice.repository;

import com.etopng.tmsservice.model.Terminal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TerminalRepository {
    private List<Terminal> terminals
            = new ArrayList<>();

    public Terminal addTerminal(Terminal terminal) {
        terminals.add(terminal);
        return terminal;
    }

    public Terminal findById(Long id) {
        return terminals.stream()
                .filter(terminal ->
                        terminal.getId().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Terminal> findAll() {
        return terminals;
    }

}
