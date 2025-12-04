package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.likes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface likesServicio {
    public likes guardarLikes(likes likes);
    public List<likes> obtenerLikes();
    public likes obtenerLikesPorId(Long id);
    public void eliminarLikes(Long id);
}
