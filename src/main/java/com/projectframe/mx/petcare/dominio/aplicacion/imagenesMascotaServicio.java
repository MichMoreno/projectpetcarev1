package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.imagenesMascota;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface imagenesMascotaServicio {
    public imagenesMascota guardarImagenesMascota(imagenesMascota imagenesMascota);
    public List<imagenesMascota> obtenerImagenesMascota();
    public imagenesMascota obtenerImagenesMascotaPorId(Long id);
    public void eliminarImagenesMascota(Long id);

}
