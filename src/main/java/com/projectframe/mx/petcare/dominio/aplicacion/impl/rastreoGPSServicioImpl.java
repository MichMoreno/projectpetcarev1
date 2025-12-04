package com.projectframe.mx.petcare.dominio.aplicacion.impl;

import com.projectframe.mx.petcare.dominio.aplicacion.rastreoGPSServicio;
import com.projectframe.mx.petcare.dominio.entidades.rastreoGPS;
import com.projectframe.mx.petcare.dominio.repositorios.rastreoGPSRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class rastreoGPSServicioImpl implements rastreoGPSServicio {
    @Autowired
    private rastreoGPSRepositorio rasGPSRepo;

    @Override
    @Transactional
    public rastreoGPS guardarRastreoGPS(rastreoGPS rastreoGPS) {
        return rasGPSRepo.save(rastreoGPS);
    }

    @Override
    public List<rastreoGPS> obtenerRastreoGPS() {
        return (List<rastreoGPS>) rasGPSRepo.findAll();
    }

    @Override
    public rastreoGPS obtenerRastreoGPSPorId(Long id) {
        return rasGPSRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarRastreoGPS(Long id) {
        rasGPSRepo.deleteById(id);
    }
}
