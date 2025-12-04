package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.postColoniaImages;
import com.projectframe.mx.petcare.dominio.entidades.postImages;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface postImagesServicio {
    public postImages guardarPostImages(postImages postImages);
    public List<postColoniaImages> obtenerPostColoniaImagesPorId(Long id);
    public postImages obtenerPostImagesPorId(Long id);
    public void eliminarPostImagesPorId(Long id);
}
