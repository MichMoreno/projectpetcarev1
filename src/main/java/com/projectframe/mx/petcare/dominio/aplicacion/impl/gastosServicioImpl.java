package com.projectframe.mx.petcare.dominio.aplicacion.impl;

import com.projectframe.mx.petcare.dominio.aplicacion.gastosServicio;
import com.projectframe.mx.petcare.dominio.entidades.gastos;
import com.projectframe.mx.petcare.dominio.repositorios.gastosRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class gastosServicioImpl implements gastosServicio {
    @Autowired
    private gastosRepositorio gasRepo;

    @Override
    @Transactional
    public gastos guardarGastos(gastos gastos) {
        return gasRepo.save(gastos);
    }

    @Override
    public List<gastos> obtenerGastosServicio() {
        return (List<gastos>) gasRepo.findAll();
    }

    @Override
    public gastos obtenerGastosPorId(Long id) {
        return gasRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarGastos(Long id) {
        gasRepo.deleteById(id);
    }
}
