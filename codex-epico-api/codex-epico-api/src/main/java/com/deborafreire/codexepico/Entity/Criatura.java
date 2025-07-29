package com.deborafreire.codexepico.Entity;

import jakarta.persistence.GenerationType;

@Entity
public class Criatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String tipo;
    private String descricao;
    private int forca;
    private int defesa;
    private int magia;

    

}