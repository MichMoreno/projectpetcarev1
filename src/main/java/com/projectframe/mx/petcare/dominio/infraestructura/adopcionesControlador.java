package com.projectframe.mx.petcare.dominio.infraestructura;

import com.projectframe.mx.petcare.dominio.aplicacion.adopcionesServicio;
import com.projectframe.mx.petcare.dominio.entidades.adopciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/petcare")
public class adopcionesControlador {
    @Autowired
    private adopcionesServicio adopcionesServicio;

    @GetMapping("/alladopciones")
    @ResponseStatus(HttpStatus.OK)
    public List<adopciones> getAllAdopciones() {
        return adopcionesServicio.obtenerAdopciones();
    }

    @GetMapping("/adopciones/{id}")
    @ResponseStatus(HttpStatus.OK)
    public adopciones obtenerAdopciones(@PathVariable Long id) {
        return adopcionesServicio.obtenerAdopcionesPorId(id);
    }

    @PostMapping("/create-adopcion")
    @ResponseStatus(HttpStatus.OK)
    public adopciones crearAdopciones(@RequestBody adopciones adopciones) {
        return adopcionesServicio.guardarAdopciones(adopciones);
    }

    @PutMapping("/update-adopcion/{id}")
    @ResponseStatus(HttpStatus.OK)
    public adopciones updateAdopciones(@RequestBody adopciones adopciones,  @PathVariable Long id) {
        adopciones ado = adopcionesServicio.obtenerAdopcionesPorId(id);
        ado.setDisponible(adopciones.getDisponible());
        ado.setMascotaId(adopciones.getMascotaId());
        ado.setUsuarioPublicadorId(adopciones.getUsuarioPublicadorId());
        ado.setFechaPublicacion(adopciones.getFechaPublicacion());
        return adopcionesServicio.guardarAdopciones(ado);
    }

    @DeleteMapping("/delete-adopcion/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteAdopciones(@PathVariable Long id) {
        adopcionesServicio.eliminarAdopciones(id);
    }
}
