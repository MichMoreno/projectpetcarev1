package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.likesColonia;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface likesColoniaServicio {
    public likesColonia guardarLikesColonia(likesColonia likesColonia);
    public List<likesColonia> obtenerLikesColonia();
    public likesColonia obtenerLikesPorId(Long id);
    public void eliminarLikesColonia(Long id);
}
