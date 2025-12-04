package com.projectframe.mx.petcare.dominio.infraestructura;

import com.projectframe.mx.petcare.dominio.aplicacion.presupuestosServicio;
import com.projectframe.mx.petcare.dominio.entidades.presupuestos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/petcare")
public class presupuestosControlador {
    @Autowired
    private presupuestosServicio presupuestosServicio;

    @GetMapping("/allpresupuestos")
    @ResponseStatus(HttpStatus.OK)
    public List<presupuestos> allPresupuestos(){
        return presupuestosServicio.obtenerPresupuestos();
    }

    @GetMapping("/presupuesto/{id}")
    @ResponseStatus(HttpStatus.OK)
    public presupuestos presupuesto(@PathVariable long id){
        return presupuestosServicio.obtenerPresupuestosPorId(id);
    }

    @PostMapping("/create-presupuesto")
    @ResponseStatus(HttpStatus.OK)
    public presupuestos guardarPresupuesto(@RequestBody presupuestos presupuestos){
        return presupuestosServicio.guardarPresupuestos(presupuestos);
    }

    @PutMapping("/update-presupuesto")
    @ResponseStatus(HttpStatus.OK)
    public presupuestos actualizarPresupuesto(@RequestBody presupuestos presupuestos, @PathVariable Long id){
        presupuestos pre = presupuestosServicio.obtenerPresupuestosPorId(id);
        pre.setUsuarioId(presupuestos.getUsuarioId());
        pre.setMonto(presupuestos.getMonto());
        pre.setMes(presupuestos.getMes());
        pre.setCreatedAt(presupuestos.getCreatedAt());
        return presupuestosServicio.guardarPresupuestos(pre);
    }

    @DeleteMapping("/delete-presupuesto")
    @ResponseStatus(HttpStatus.OK)
    public void eliminarPresupuesto(@PathVariable Long id){
        presupuestosServicio.eliminarPresupuestos(id);
    }
}
