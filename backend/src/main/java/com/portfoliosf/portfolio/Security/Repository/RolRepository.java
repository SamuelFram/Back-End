
package com.portfoliosf.portfolio.Security.Repository;

import com.portfoliosf.portfolio.Security.Entity.Rol;
import com.portfoliosf.portfolio.Security.Enums.RotNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol , Integer> {
    Optional<Rol> findByRolNombre(RotNombre rotNombre);
}
