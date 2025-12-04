package com.projectframe.mx.petcare.dominio.aplicacion.impl;

import com.projectframe.mx.petcare.dominio.aplicacion.postsColoniaServicio;
import com.projectframe.mx.petcare.dominio.entidades.postsColonia;
import com.projectframe.mx.petcare.dominio.repositorios.postsColoniaRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class postsColoniaServicioImpl implements postsColoniaServicio {
    @Autowired
    private postsColoniaRepositorio poColRepo;

    @Override
    @Transactional
    public postsColonia guardarPostsColonia(postsColonia postsColonia) {
        return poColRepo.save(postsColonia);
    }

    @Override
    public List<postsColonia> obtenerPostsColonia() {
        return (List<postsColonia>) poColRepo.findAll();
    }

    @Override
    public postsColonia obtenerPostsPorId(Long id) {
        return poColRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarPostsColonia(Long id) {
        poColRepo.deleteById(id);
    }
}
