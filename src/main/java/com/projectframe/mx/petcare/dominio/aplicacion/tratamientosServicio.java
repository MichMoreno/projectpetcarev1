package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.tratamientos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface tratamientosServicio {
    public tratamientos guardarTratamientos(tratamientos tratamientos);
    public List<tratamientos> obtenerTratamientosServicio();
    public tratamientos obtenerTratamientosPorId(Long id);
    public void eliminarTratamientosServicio(Long id);
}
