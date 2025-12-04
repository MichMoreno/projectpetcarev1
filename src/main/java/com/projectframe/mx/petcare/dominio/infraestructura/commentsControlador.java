package com.projectframe.mx.petcare.dominio.infraestructura;

import com.projectframe.mx.petcare.dominio.aplicacion.commentsServicio;
import com.projectframe.mx.petcare.dominio.entidades.comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/petcare")
public class commentsControlador {
    @Autowired
    private commentsServicio commentsServicio;

    @GetMapping("allcomments")
    @ResponseStatus(HttpStatus.OK)
    public List<comments> obtenerAllComments() {
        return commentsServicio.obtenerComments();
    }

    @GetMapping("comments/{id}")
    @ResponseStatus(HttpStatus.OK)
    public comments obtenerComments(@PathVariable Long id) {
        return commentsServicio.obtenerCommentPorId(id);
    }

    @PostMapping("/create-comment")
    @ResponseStatus(HttpStatus.CREATED)
    public comments crearComment(@RequestBody comments comment) {
        return commentsServicio.guardarComment(comment);
    }

    @PutMapping("/update-comment/{id}")
    @ResponseStatus(HttpStatus.OK)
    public comments actualizarComment(@PathVariable Long id, @RequestBody comments comment) {
        comments comm = commentsServicio.obtenerCommentPorId(id);
        comm.setContenido(comment.getContenido());
        comm.setPostId(comment.getPostId());
        comm.setUserId(comment.getUserId());
        comm.setFechaCreacion(comment.getFechaCreacion());
        return commentsServicio.guardarComment(comm);
    }

    @DeleteMapping("/delete-comment/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void eliminarComment(@PathVariable Long id) {
        commentsServicio.eliminarComment(id);
    }

}
