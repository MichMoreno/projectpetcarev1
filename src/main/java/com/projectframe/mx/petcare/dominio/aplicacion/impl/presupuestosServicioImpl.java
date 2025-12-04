package com.projectframe.mx.petcare.dominio.aplicacion.impl;

import com.projectframe.mx.petcare.dominio.aplicacion.presupuestosServicio;
import com.projectframe.mx.petcare.dominio.entidades.presupuestos;
import com.projectframe.mx.petcare.dominio.repositorios.presupuestosRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class presupuestosServicioImpl implements presupuestosServicio {
    @Autowired
    private presupuestosRepositorio preRepo;

    @Override
    @Transactional
    public presupuestos guardarPresupuestos(presupuestos presupuestos) {
        return preRepo.save(presupuestos);
    }

    @Override
    public List<presupuestos> obtenerPresupuestos() {
        return (List<presupuestos>) preRepo.findAll();
    }

    @Override
    public presupuestos obtenerPresupuestosPorId(Long id) {
        return preRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarPresupuestos(Long id) {
        preRepo.deleteById(id);
    }
}
