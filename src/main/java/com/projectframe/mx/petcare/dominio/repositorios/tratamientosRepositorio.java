package com.projectframe.mx.petcare.dominio.repositorios;

import com.projectframe.mx.petcare.dominio.entidades.tratamientos;
import org.springframework.data.repository.CrudRepository;

public interface tratamientosRepositorio extends CrudRepository<tratamientos, Long> {
}
