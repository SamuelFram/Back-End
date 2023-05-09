
package com.portfoliosf.portfolio.Security.Service;

import com.portfoliosf.portfolio.Security.Entity.Rol;
import com.portfoliosf.portfolio.Security.Enums.RotNombre;
import com.portfoliosf.portfolio.Security.Repository.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
  @Autowired
  RolRepository rolRepository;
  
  public Optional <Rol> getByRotNombre(RotNombre rotNombre){
      return rolRepository.findByRolNombre(rotNombre);
      
  }
  
  public void save(Rol rol){
      rolRepository.save(rol);
  }
}
