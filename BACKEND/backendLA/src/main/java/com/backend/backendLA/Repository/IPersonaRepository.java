package com.backend.backendLA.Repository;

import com.backend.backendLA.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long>{
    
}
