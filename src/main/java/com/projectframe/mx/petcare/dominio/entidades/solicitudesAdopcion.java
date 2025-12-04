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
@Table(name = "solicitudes_adopcion")
public class solicitudesAdopcion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "adopcion_id", nullable = false)
    private Long adopcionId;

    @Column(name = "solicitante_id", nullable = false)
    private Long solicitanteId;

    @Column(columnDefinition = "TEXT")
    private String mensaje;

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private Estado estado = Estado.pendiente;

    @Column(name = "fecha_solicitud", nullable = false)
    private LocalDate fechaSolicitud;

    @Column(name = "created_at", nullable = false)
    private LocalDate createdAt;

    public enum Estado {
        pendiente, aceptada, rechazada
    }

    @PrePersist
    protected void onCreate() {
        fechaSolicitud = LocalDate.now();
        createdAt = LocalDate.now();
    }

    @PreUpdate
    protected void onUpdate() {
        createdAt = LocalDate.now();
    }
}

