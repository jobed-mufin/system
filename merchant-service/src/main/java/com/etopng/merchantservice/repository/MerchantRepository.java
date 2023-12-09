package com.etopng.merchantservice.repository;

import com.etopng.merchantservice.model.Merchant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MerchantRepository {

    private List<Merchant> merchants
            = new ArrayList<>();

    public Merchant add(Merchant merchant) {
        merchants.add(merchant);
        return merchant;
    }

    public Merchant findById(String id) {
        return merchants.stream()
                .filter(a -> a.id().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Merchant> findAll() {
        return merchants;
    }

    public List<Merchant> findByTerminal(String tid) {
        return merchants.stream()
                .filter(a -> a.tid().equals(tid))
                .toList();
    }
}
