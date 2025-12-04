package com.projectframe.mx.petcare.dominio.aplicacion.impl;

import com.projectframe.mx.petcare.dominio.aplicacion.likesColoniaServicio;
import com.projectframe.mx.petcare.dominio.entidades.likesColonia;
import com.projectframe.mx.petcare.dominio.repositorios.likesColoniaRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class likesColoniaServicioImpl implements likesColoniaServicio {
    @Autowired
    private likesColoniaRepositorio  liColRepo;

    @Override
    @Transactional
    public likesColonia guardarLikesColonia(likesColonia likesColonia) {
        return liColRepo.save(likesColonia);
    }

    @Override
    public List<likesColonia> obtenerLikesColonia() {
        return (List<likesColonia>) liColRepo.findAll();
    }

    @Override
    public likesColonia obtenerLikesPorId(Long id) {
        return liColRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarLikesColonia(Long id) {
        liColRepo.deleteById(id);
    }
}
