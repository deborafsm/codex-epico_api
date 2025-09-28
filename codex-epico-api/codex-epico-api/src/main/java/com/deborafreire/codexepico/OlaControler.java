package com.deborafreire.codexepico;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaControler {
    @GetMapping
    public String ola() {
        return "Olá, Mundo!";
    }
}
