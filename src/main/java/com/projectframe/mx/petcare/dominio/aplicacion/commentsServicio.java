package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.comments;

import java.util.List;

public interface commentsServicio {
    public comments guardarComment(comments comment);
    public List<comments> obtenerComments();
    public comments obtenerCommentPorId(Long id);
    public void eliminarComment(Long id);
}
