package com.projectframe.mx.petcare.dominio.aplicacion;

import com.projectframe.mx.petcare.dominio.entidades.rastreoGPS;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface rastreoGPSServicio {
    public rastreoGPS guardarRastreoGPS(rastreoGPS rastreoGPS);
    public List<rastreoGPS> obtenerRastreoGPS();
    public rastreoGPS obtenerRastreoGPSPorId(Long id);
    public void eliminarRastreoGPS(Long id);
}
