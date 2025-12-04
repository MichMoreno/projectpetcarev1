package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.postColoniaImages;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface postColoniaImagesServicio {
    public postColoniaImages guardarPostColoniaImages(postColoniaImages postColoniaImages);
    public List<postColoniaImages> obtenerPostColoniaImages();
    public postColoniaImages obtenerPostColoniaImagesPorId(Long id);
    public void eliminarPostColoniaImages(Long id);
}
