package com.projectframe.mx.petcare.dominio.infraestructura;

import com.projectframe.mx.petcare.dominio.aplicacion.solicitudesAdopcionServicio;
import com.projectframe.mx.petcare.dominio.entidades.solicitudesAdopcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/petcare")
public class solicitudesAdopcionControlador {
    @Autowired
    private solicitudesAdopcionServicio solicitudesAdopcionServicio;

    @GetMapping("/allsolicitudes-adopcion")
    @ResponseStatus
    public List<solicitudesAdopcion> obtenerSolicitudesAdopcion() {
        return solicitudesAdopcionServicio.obtenerSolicitudesServicio();
    }

    @GetMapping("/solicitud-adopcion/{id}")
    @ResponseStatus(HttpStatus.OK)
    public solicitudesAdopcion  obtenerSolicitudAdopcion(@PathVariable Long id) {
        return solicitudesAdopcionServicio.obtenerSolicitudesServicioPorId(id);
    }

    @PostMapping("/create-solicitud-adopcion")
    @ResponseStatus(HttpStatus.OK)
    public solicitudesAdopcion guardarSolicitudAdopcion(@RequestBody solicitudesAdopcion solicitud) {
        return solicitudesAdopcionServicio.guardarSolicitudesAdopcionServicio(solicitud);
    }

    @PutMapping("/update-solicitud-adopcion/{id}")
    @ResponseStatus(HttpStatus.OK)
    public solicitudesAdopcion  actualizarSolicitudAdopcion(@PathVariable Long id, @RequestBody solicitudesAdopcion solicitud) {
        solicitudesAdopcion sa = solicitudesAdopcionServicio.obtenerSolicitudesServicioPorId(id);
        sa.setAdopcionId(solicitud.getAdopcionId());
        sa.setSolicitanteId(solicitud.getSolicitanteId());
        sa.setEstado(solicitud.getEstado());
        sa.setMensaje(solicitud.getMensaje());
        sa.setFechaSolicitud(solicitud.getFechaSolicitud());
        sa.setCreatedAt(solicitud.getCreatedAt());
        return solicitudesAdopcionServicio.guardarSolicitudesAdopcionServicio(sa);
    }

    @DeleteMapping("/delete-solicitud-adopcion/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void eliminarSolicitud(@PathVariable Long id){
        solicitudesAdopcionServicio.eliminarSolicitudesServicio(id);
    }
}
