package com.projectframe.mx.petcare.dominio.aplicacion.impl;

import com.projectframe.mx.petcare.dominio.aplicacion.imagenesMascotaServicio;
import com.projectframe.mx.petcare.dominio.entidades.imagenesMascota;
import com.projectframe.mx.petcare.dominio.repositorios.imagenesMascotaRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class imagenesMascotaServicioImpl implements imagenesMascotaServicio {
    @Autowired
    private imagenesMascotaRepositorio imageMascRepo;

    @Override
    public imagenesMascota guardarImagenesMascota(imagenesMascota imagenesMascota) {
        return imageMascRepo.save(imagenesMascota);
    }

    @Override
    public List<imagenesMascota> obtenerImagenesMascota() {
        return (List<imagenesMascota>) imageMascRepo.findAll();
    }

    @Override
    public imagenesMascota obtenerImagenesMascotaPorId(Long id) {
        return imageMascRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarImagenesMascota(Long id) {
        imageMascRepo.deleteById(id);
    }
}
