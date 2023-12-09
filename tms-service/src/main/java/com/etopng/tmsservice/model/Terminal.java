package com.etopng.tmsservice.model;

import com.etopng.tmsservice.dto.Merchant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Terminal {

    private String id;
    private String name;
    private List<Merchant> merchants = new ArrayList<>();


}
