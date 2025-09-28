package com.deborafreire.codexepico.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.deborafreire.codexepico.Entity.EntityCards;



public interface CartaRepository extends JpaRepository<EntityCards, Long> {
}