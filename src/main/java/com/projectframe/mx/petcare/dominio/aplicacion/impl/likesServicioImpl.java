package com.projectframe.mx.petcare.dominio.aplicacion.impl;

import com.projectframe.mx.petcare.dominio.aplicacion.likesServicio;
import com.projectframe.mx.petcare.dominio.entidades.likes;
import com.projectframe.mx.petcare.dominio.repositorios.likesRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class likesServicioImpl implements likesServicio {
    @Autowired
    private likesRepositorio liRepo;

    @Override
    public likes guardarLikes(likes likes) {
        return liRepo.save(likes);
    }

    @Override
    public List<likes> obtenerLikes() {
        return (List<likes>) liRepo.findAll();
    }

    @Override
    public likes obtenerLikesPorId(Long id) {
        return liRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarLikes(Long id) {
        liRepo.deleteById(id);
    }
}
