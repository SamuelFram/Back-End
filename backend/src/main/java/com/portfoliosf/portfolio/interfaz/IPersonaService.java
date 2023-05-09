
package com.portfoliosf.portfolio.interfaz;

import com.portfoliosf.portfolio.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer lista
    public List<Persona> getPersona();
    //guardar persona
    public void savePersona (Persona persona);
    //eliminar objeto
    public void deletePersona (Long Id);
    //Buscar persona
    public Persona findPersona (Long Id);
    
    
}
