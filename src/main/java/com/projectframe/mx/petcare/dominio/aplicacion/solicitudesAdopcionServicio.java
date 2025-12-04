package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.solicitudesAdopcion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface solicitudesAdopcionServicio {
    public solicitudesAdopcion guardarSolicitudesAdopcionServicio(solicitudesAdopcion solicitudesAdopcion);
    public List<solicitudesAdopcion> obtenerSolicitudesServicio();
    public solicitudesAdopcion obtenerSolicitudesServicioPorId(Long id);
    public void eliminarSolicitudesServicio(Long id);
}
