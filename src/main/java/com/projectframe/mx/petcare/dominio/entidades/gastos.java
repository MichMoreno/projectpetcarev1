package com.projectframe.mx.petcare.dominio.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "gastos")
public class gastos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuario_id", nullable = false)
    private Long usuarioId;

    @Column(name = "mascota_id")
    private Long mascotaId;

    @Column(nullable = false, length = 100)
    private String categoria;

    @Column(nullable = false)
    private Double monto;

    @Column(nullable = false)
    private Date fecha;

    @Column(length = 100)
    private String proveedor;

    @Column(name = "fecha_recordatorio")
    private LocalDate fechaRecordatorio;

    @Column(name = "created_at", nullable = false)
    private LocalDate fechaCreacion;

    @PrePersist
    public void prePersist() {
        fechaCreacion = LocalDate.now();
    }
    @PreUpdate
    public void preUpdate() {
        fechaCreacion = LocalDate.now();
    }
}
