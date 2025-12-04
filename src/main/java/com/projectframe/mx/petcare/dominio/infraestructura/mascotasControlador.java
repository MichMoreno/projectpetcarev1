package com.projectframe.mx.petcare.dominio.infraestructura;

import com.projectframe.mx.petcare.dominio.aplicacion.mascotasServicio;
import com.projectframe.mx.petcare.dominio.entidades.mascotas;
import com.projectframe.mx.petcare.dominio.repositorios.mascotasRepositorio;

import com.projectframe.mx.petcare.dominio.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("petcare/api")
public class mascotasControlador {
    @Autowired
    private EmailService emailService;
    @Autowired
    private mascotasServicio mascotasServicio;

    @GetMapping("/allmascotas")
    @ResponseStatus(HttpStatus.OK)
    public List<mascotas> allMascotas() { return mascotasServicio.obtenerMascotas(); }

    @GetMapping("/mascota/{id}")
    @ResponseStatus(HttpStatus.OK)
    public mascotas obtenerMascotas(@PathVariable Long id) {
        return mascotasServicio.obtenerMascotasPorId(id);
    }

    @PostMapping("/create-mascota")
    @ResponseStatus(HttpStatus.OK)
    public mascotas guardarMascotas(@RequestBody mascotas mascotas) {
        String texto = "Se ha registrado este correo electronico exitosamente en nuestra base de datos";
        /*EmailUser = mascotas.getUsuarioId();
        String to = mascotas.
        String subject = "Registro en Administracion Eventos";

        emailService.sendEmail(to,subject,texto);*/
        return mascotasServicio.guardarMascotas(mascotas);
    }

    @DeleteMapping("/delete-mascota/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void eliminarMascotas(@PathVariable Long id) {
        mascotasServicio.eliminarMascotas(id);
    }

    @PostMapping("/update-mascota")
    @ResponseStatus(HttpStatus.OK)
    public mascotas actualizarMascotas (
            @RequestBody mascotas mascotas,
            @PathVariable Long id) {
        mascotas masc =  mascotasServicio.obtenerMascotasPorId(id);
        masc.setNombre(mascotas.getNombre());
        masc.setEspecie(mascotas.getEspecie());
        masc.setRaza(mascotas.getRaza());
        masc.setGenero(mascotas.getGenero());
        masc.setPeso(mascotas.getPeso());
        masc.setVacunado(mascotas.getVacunado());
        masc.setEsterilizado(mascotas.getEsterilizado());
        masc.setDescripcion(mascotas.getDescripcion());
        masc.setTieneSeguro(mascotas.getTieneSeguro());
        return mascotasServicio.guardarMascotas(masc);
    }

}
