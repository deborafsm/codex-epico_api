package com.deborafreire.codexepico.repository;

import com.deborafreire.codexepico.model.Criatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriaturaRepository extends JpaRepository<Criatura, Long> {
     
}
