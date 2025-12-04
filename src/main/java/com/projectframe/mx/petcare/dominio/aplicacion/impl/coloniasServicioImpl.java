package com.projectframe.mx.petcare.dominio.aplicacion.impl;

import com.projectframe.mx.petcare.dominio.aplicacion.coloniasServicio;
import com.projectframe.mx.petcare.dominio.entidades.colonias;
import com.projectframe.mx.petcare.dominio.repositorios.coloniasRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class coloniasServicioImpl implements coloniasServicio {
    @Autowired
    private coloniasRepositorio colRepo;

    @Override
    public colonias guardarColonia(colonias colonia) {
        return colRepo.save(colonia);
    }

    @Override
    public List<colonias> obtenerColonias() {
        return (List<colonias>) colRepo.findAll();
    }

    @Override
    public colonias obtenerColoniaPorId(Long id) {
        return colRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarColonia(Long id) {
        colRepo.deleteById(id);
    }
}
