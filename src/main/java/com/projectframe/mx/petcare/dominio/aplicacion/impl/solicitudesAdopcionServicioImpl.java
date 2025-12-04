package com.projectframe.mx.petcare.dominio.aplicacion.impl;

import com.projectframe.mx.petcare.dominio.aplicacion.solicitudesAdopcionServicio;
import com.projectframe.mx.petcare.dominio.entidades.solicitudesAdopcion;
import com.projectframe.mx.petcare.dominio.repositorios.solicitudesAdopcionRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class solicitudesAdopcionServicioImpl implements solicitudesAdopcionServicio {
    @Autowired
    private solicitudesAdopcionRepositorio solAdopRepo;

    @Override
    public solicitudesAdopcion guardarSolicitudesAdopcionServicio(solicitudesAdopcion solicitudesAdopcion) {
        return solAdopRepo.save(solicitudesAdopcion);
    }

    @Override
    public List<solicitudesAdopcion> obtenerSolicitudesServicio() {
        return (List<solicitudesAdopcion>) solAdopRepo.findAll();
    }

    @Override
    public solicitudesAdopcion obtenerSolicitudesServicioPorId(Long id) {
        return solAdopRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarSolicitudesServicio(Long id) {
        solAdopRepo.deleteById(id);
    }
}
