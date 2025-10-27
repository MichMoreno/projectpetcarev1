package com.projectframe.mx.petcare.dominio.infraestructura;

import com.projectframe.mx.petcare.dominio.aplicacion.mascotasServicio;
import com.projectframe.mx.petcare.dominio.entidades.mascotas;
import com.projectframe.mx.petcare.dominio.repositorios.mascotasRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("petcare/api")
public class mascotasControlador {
    @Autowired
    private mascotasServicio mascotasServicio;


}
