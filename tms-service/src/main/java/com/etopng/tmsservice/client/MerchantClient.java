package com.etopng.tmsservice.client;

import com.etopng.tmsservice.dto.Merchant;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface MerchantClient {

    @GetExchange("/merchant/terminals/{merchantId}")
    public List<Merchant> findByMerchant(@PathVariable("merchantId") String merchantId);

}
