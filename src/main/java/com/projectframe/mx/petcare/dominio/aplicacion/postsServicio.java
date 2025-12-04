package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.posts;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface postsServicio {
    public posts guardarPosts(posts posts);
    public List<posts> obtenerPosts();
    public posts obtenerPostsPorId(Long id);
    public void eliminarPosts(Long id);
}
