package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.commentsColonia;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface commentsColoniaServicio {
    public commentsColonia guardarCommentsColonia(commentsColonia commentsColonia);
    public List<commentsColonia> obtenerCommentsColonia();
    public commentsColonia obtenerCommentsColoniaPorId(Long id);
    public void eliminarCommentsColonia(Long id);
}
