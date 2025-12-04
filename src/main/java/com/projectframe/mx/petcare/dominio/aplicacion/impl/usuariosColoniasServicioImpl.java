package com.projectframe.mx.petcare.dominio.aplicacion.impl;

import com.projectframe.mx.petcare.dominio.aplicacion.usuariosColoniasServicio;
import com.projectframe.mx.petcare.dominio.entidades.usuariosColonias;
import com.projectframe.mx.petcare.dominio.repositorios.usuariosColoniasRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class usuariosColoniasServicioImpl implements usuariosColoniasServicio {
    @Autowired
    private usuariosColoniasRepositorio userColRepo;

    @Override
    public usuariosColonias guardarUsuariosColonias(usuariosColonias usuariosColonias) {
        return userColRepo.save(usuariosColonias);
    }

    @Override
    public List<usuariosColonias> obtenerUsuariosColonias() {
        return (List<usuariosColonias>) userColRepo.findAll();
    }

    @Override
    public usuariosColonias obtenerUsuariosColoniasPorId(Long id) {
        return userColRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarUsuariosColonias(Long id) {
        userColRepo.deleteById(id);
    }
}
