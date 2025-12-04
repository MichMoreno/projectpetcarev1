package com.projectframe.mx.petcare.dominio.aplicacion.impl;

import com.projectframe.mx.petcare.dominio.aplicacion.postImagesServicio;
import com.projectframe.mx.petcare.dominio.entidades.postColoniaImages;
import com.projectframe.mx.petcare.dominio.entidades.postImages;
import com.projectframe.mx.petcare.dominio.repositorios.postImagesRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class postImagesServicioImpl implements postImagesServicio {
    @Autowired
    private postImagesRepositorio poImgRepo;

    @Override
    @Transactional
    public postImages guardarPostImages(postImages postImages) {
        return poImgRepo.save(postImages);
    }

    @Override
    public List<postImages> obtenerPostImages() {
        return (List<postImages>) poImgRepo.findAll();
    }


    @Override
    public postImages obtenerPostImagesPorId(Long id) {
        return poImgRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarPostImagesPorId(Long id) {
        poImgRepo.deleteById(id);
    }
}
