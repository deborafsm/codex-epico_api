package com.deborafreire.codexepico.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deborafreire.codexepico.Entity.EntityCards;
import com.deborafreire.codexepico.Repository.CartaRepository;

public class ControllerCards {
    @RestController
    @RequestMapping("/cards")
    public class CardController {
        // Aqui você pode adicionar métodos para lidar com requisições relacionadas às cartas
        private final CartaRepository cartaRepository;
        public CardController(CartaRepository cartaRepository) {
            this.cartaRepository = cartaRepository;
        }
    @GetMapping
    public List<EntityCards> getAllCards() {
        return cartaRepository.findAll();
    }
    

}
