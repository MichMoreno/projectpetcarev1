package com.projectframe.mx.petcare.dominio.aplicacion.impl;

import com.projectframe.mx.petcare.dominio.aplicacion.postsServicio;
import com.projectframe.mx.petcare.dominio.entidades.posts;
import com.projectframe.mx.petcare.dominio.repositorios.postsRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class postsServicioImpl implements postsServicio {
    @Autowired
    private postsRepositorio poRepo;

    @Override
    @Transactional
    public posts guardarPosts(posts posts) {
        return poRepo.save(posts);
    }

    @Override
    public List<posts> obtenerPosts() {
        return (List<posts>) poRepo.findAll();
    }

    @Override
    public posts obtenerPostsPorId(Long id) {
        return poRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarPosts(Long id) {
        poRepo.deleteById(id);
    }
}
