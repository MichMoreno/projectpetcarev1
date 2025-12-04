package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.gastos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface gastosServicio {
    public gastos guardarGastos(gastos gastos);
    public List<gastos> obtenerGastos();
    public gastos obtenerGastosPorId(Long id);
    public void eliminarGastos(Long id);
}
