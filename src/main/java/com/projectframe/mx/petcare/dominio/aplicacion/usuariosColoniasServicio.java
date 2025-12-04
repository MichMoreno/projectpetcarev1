package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.usuariosColonias;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface usuariosColoniasServicio {
    public usuariosColonias guardarUsuariosColonias(usuariosColonias usuariosColonias);
    public List<usuariosColonias> obtenerUsuariosColonias();
    public usuariosColonias obtenerUsuariosColoniasPorId(Long id);
    public void eliminarUsuariosColonias(Long id);
}
