package com.projectframe.mx.petcare.dominio.aplicacion.impl;

import com.projectframe.mx.petcare.dominio.aplicacion.tratamientosServicio;
import com.projectframe.mx.petcare.dominio.entidades.tratamientos;
import com.projectframe.mx.petcare.dominio.repositorios.tratamientosRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class tratamientosServicioImpl implements tratamientosServicio {
    @Autowired
    private tratamientosRepositorio tratRepo;

    @Override
    public tratamientos guardarTratamientos(tratamientos tratamientos) {
        return tratRepo.save(tratamientos);
    }

    @Override
    public List<tratamientos> obtenerTratamientosServicio() {
        return (List<tratamientos>) tratRepo.findAll();
    }

    @Override
    public tratamientos obtenerTratamientosPorId(Long id) {
        return tratRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarTratamientosServicio(Long id) {
        tratRepo.deleteById(id);
    }
}
