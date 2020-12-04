package com.diegun.proyectopro2.models.dao;

import com.diegun.proyectopro2.models.entity.DatosSocio;
import org.springframework.data.jpa.repository.JpaRepository;



public interface DatosSocioDao extends JpaRepository<DatosSocio, Long > {// obtener métodos del crud importanto el identity y el tipo


    
}