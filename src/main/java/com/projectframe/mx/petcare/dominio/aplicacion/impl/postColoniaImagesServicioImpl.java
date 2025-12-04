package com.projectframe.mx.petcare.dominio.aplicacion.impl;

import com.projectframe.mx.petcare.dominio.aplicacion.postColoniaImagesServicio;
import com.projectframe.mx.petcare.dominio.entidades.postColoniaImages;
import com.projectframe.mx.petcare.dominio.repositorios.postColoniaImagesRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class postColoniaImagesServicioImpl implements postColoniaImagesServicio {
    @Autowired
    private postColoniaImagesRepositorio poCoImgRepo;

    @Override
    @Transactional
    public postColoniaImages guardarPostColoniaImages(postColoniaImages postColoniaImages) {
        return poCoImgRepo.save(postColoniaImages);
    }

    @Override
    public List<postColoniaImages> obtenerPostColoniaImages() {
        return (List<postColoniaImages>) poCoImgRepo.findAll();
    }

    @Override
    public postColoniaImages obtenerPostColoniaImagesPorId(Long id) {
        return poCoImgRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarPostColoniaImages(Long id) {
        poCoImgRepo.deleteById(id);
    }
}
