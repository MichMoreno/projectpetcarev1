package com.projectframe.mx.petcare.dominio.aplicacion.impl;

import com.projectframe.mx.petcare.dominio.aplicacion.commentsColoniaServicio;
import com.projectframe.mx.petcare.dominio.entidades.commentsColonia;
import com.projectframe.mx.petcare.dominio.repositorios.commentsColoniaRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class commentsColoniaServicioImpl implements commentsColoniaServicio {
    @Autowired
    private commentsColoniaRepositorio commColRepo;

    @Override
    @Transactional
    public commentsColonia guardarCommentsColonia(commentsColonia commentsColonia) {
        return commColRepo.save(commentsColonia);
    }

    @Override
    public List<commentsColonia> obtenerCommentsColonia() {
        return (List<commentsColonia>) commColRepo.findAll();
    }

    @Override
    public commentsColonia obtenerCommentsColoniaPorId(Long id) {
        return commColRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarCommentsColonia(Long id) {
        commColRepo.deleteById(id);
    }
}
