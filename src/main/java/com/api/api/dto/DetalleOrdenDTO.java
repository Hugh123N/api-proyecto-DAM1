package com.api.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetalleOrdenDTO {
    private String nombre;
    private int cantidad;
    private double precio;
    private double total;
    private Integer ordenId;  // ID de la orden en lugar del objeto completo
    private Integer productoId;  // ID de la producto en lugar del objeto completo

}
