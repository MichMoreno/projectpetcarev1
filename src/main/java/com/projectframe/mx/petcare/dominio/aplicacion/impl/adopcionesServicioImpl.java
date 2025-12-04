package com.projectframe.mx.petcare.dominio.aplicacion.impl;

import com.projectframe.mx.petcare.dominio.aplicacion.adopcionesServicio;
import com.projectframe.mx.petcare.dominio.entidades.adopciones;
import com.projectframe.mx.petcare.dominio.repositorios.adopcionesRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Slf4j
public class adopcionesServicioImpl implements adopcionesServicio {
    @Autowired
    private adopcionesRepositorio adopRepo;

    @Override
    @Transactional
    public adopciones guardarAdopciones(adopciones adopciones) {
        return adopRepo.save(adopciones);
    }

    @Override
    public List<adopciones> obtenerAdopciones(){
        return (List<adopciones>) adopRepo.findAll();
    }

    @Override
    public adopciones obtenerAdopcionesPorId(Long id) {
        return adopRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarAdopciones(Long id) {
        adopRepo.deleteById(id);
    }

}
