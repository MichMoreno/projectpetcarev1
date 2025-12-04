package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.postsColonia;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface postsColoniaServicio {
    public postsColonia guardarPostsColonia(postsColonia postsColonia);
    public List<postsColonia> obtenerPostsColonia();
    public postsColonia obtenerPostsPorId(Long id);
    public void eliminarPostsColonia(Long id);
}

