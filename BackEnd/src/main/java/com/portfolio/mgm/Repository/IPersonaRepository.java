
package com.portfolio.mgm.Repository;

import com.portfolio.mgm.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPersonaRepository extends JpaRepository<Persona, Long> {

    
}
