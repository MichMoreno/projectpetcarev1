package com.projectframe.mx.petcare.dominio.aplicacion.impl;

import com.projectframe.mx.petcare.dominio.aplicacion.mascotasServicio;
import com.projectframe.mx.petcare.dominio.entidades.mascotas;
import com.projectframe.mx.petcare.dominio.repositorios.mascotasRepositorio;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class mascotaServicioImpl implements mascotasServicio {
    @Autowired
    private mascotasRepositorio mascRepo;

    @Override
    @Transactional
    public mascotas guardarMascotas(mascotas masc){ return mascRepo.save(masc); }

    @Override
    public List<mascotas> obtenerMascotas(){ return (List<mascotas>) mascRepo.findAll(); }

    @Override
    public mascotas obtenerMascotasPorId(Long id){ return  mascRepo.findById(id).orElse(null); }

    public void eliminarMascotas(Long id){
        mascRepo.deleteById(id);
    }

}
