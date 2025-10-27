package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.mascotas;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface mascotasServicio {
    public mascotas guardarMascotas(mascotas mascotas);
    public List<mascotas> obtenerMascotas();
    public mascotas obtenerMascotasPorId(Long id);
    public void eliminarMascotas(Long id);
}
