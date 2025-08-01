package com.deborafreire.codexepico.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coloraturas")
public class CriaturaControler {
    @GetMapping("/testes")
    public String teste() {
        return "Controller de criaturas está funcionado";
    }

}
