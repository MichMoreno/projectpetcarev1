package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.adopciones;

import java.util.List;

public interface adopcionesServicio {
    public adopciones guardarAdopciones(adopciones adopciones);
    public List<adopciones> obtenerAdopciones();
    public adopciones obtenerAdopcionesPorId(Long id);
    public void eliminarAdopciones(Long id);
}
