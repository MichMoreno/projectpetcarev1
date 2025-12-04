package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.colonias;

import java.util.List;

public interface coloniasServicio {
    public colonias guardarColonia(colonias colonia);
    public List<colonias> obtenerColonias();
    public colonias obtenerColoniaPorId(Long id);
    public void eliminarColonia(Long id);
}
