package com.projectframe.mx.petcare.dominio.infraestructura;

import com.projectframe.mx.petcare.dominio.aplicacion.coloniasServicio;
import com.projectframe.mx.petcare.dominio.entidades.colonias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/petcare")
public class coloniasControlador {
    @Autowired
    private coloniasServicio coloniasServicio;

    @GetMapping("/allcolonias")
    @ResponseStatus(HttpStatus.OK)
    public List<colonias> obtenerColonias() {
        return coloniasServicio.obtenerColonias();
    }

    @GetMapping("/colonia/{id}")
    @ResponseStatus(HttpStatus.OK)
    public colonias obtenerColoniaPorId(@PathVariable Long id) {
        return coloniasServicio.obtenerColoniaPorId(id);
    }

    @PostMapping("/create-colonia")
    @ResponseStatus(HttpStatus.OK)
    public colonias guardarColonia(@RequestBody colonias colonia) {
        return coloniasServicio.guardarColonia(colonia);
    }

    @PutMapping("/update-colonia/{id}")
    @ResponseStatus(HttpStatus.OK)
    public colonias actualizarColonia(@RequestBody colonias colonia, @PathVariable Long id) {
        colonias col =  coloniasServicio.obtenerColoniaPorId(id);
        col.setNombre(colonia.getNombre());
        col.setCodigoInvitacion(colonia.getCodigoInvitacion());
        col.setUserId(colonia.getUserId());
        return coloniasServicio.guardarColonia(col);
    }

    @DeleteMapping("/delete-colonia/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void eliminarColonia(@PathVariable Long id) {
        coloniasServicio.eliminarColonia(id);
    }
}
