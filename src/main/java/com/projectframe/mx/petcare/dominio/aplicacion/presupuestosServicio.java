package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.presupuestos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface presupuestosServicio {
    public presupuestos guardarPresupuestos(presupuestos presupuestos);
    public List<presupuestos> obtenerPresupuestos();
    public presupuestos obtenerPresupuestosPorId(Long id);
    public void eliminarPresupuestos(Long id);
}
