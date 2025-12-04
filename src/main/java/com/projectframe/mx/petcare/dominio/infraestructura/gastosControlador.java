package com.projectframe.mx.petcare.dominio.infraestructura;

import com.projectframe.mx.petcare.dominio.aplicacion.gastosServicio;
import com.projectframe.mx.petcare.dominio.entidades.gastos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/petcare")
public class gastosControlador {
    @Autowired
    private gastosServicio gastosServicio;

    @GetMapping("/allgastos")
    @ResponseStatus(HttpStatus.OK)
    public List<gastos> obtenerGastos() {
        return gastosServicio.obtenerGastos();
    }

    @GetMapping("gasto/{id}")
    @ResponseStatus(HttpStatus.OK)
    public gastos obtenerGastos(@PathVariable Long id) {
        return gastosServicio.obtenerGastosPorId(id);
    }

    @PostMapping("/create-gasto")
    @ResponseStatus(HttpStatus.OK)
    public gastos guardarGastos(@RequestBody gastos gastos) {
        return gastosServicio.guardarGastos(gastos);
    }

    @PutMapping("/update-gasto")
    @ResponseStatus(HttpStatus.OK)
    public gastos actualizarGasto(@RequestBody gastos gastos, @PathVariable Long id){
        gastos gas = gastosServicio.obtenerGastosPorId(id);
        gas.setCategoria(gastos.getCategoria());
        gas.setMonto(gastos.getMonto());
        gas.setProveedor(gastos.getProveedor());
        gas.setMascotaId(gastos.getMascotaId());
        gas.setUsuarioId(gastos.getUsuarioId());
        gas.setFecha(gastos.getFecha());
        gas.setFechaRecordatorio(gastos.getFechaRecordatorio());
        gas.setFechaCreacion(gastos.getFechaCreacion());
        return gastosServicio.guardarGastos(gastos);
    }

    @DeleteMapping("/delete-gasto/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void eliminarGastos(@PathVariable Long id) {
        gastosServicio.eliminarGastos(id);
    }
}
