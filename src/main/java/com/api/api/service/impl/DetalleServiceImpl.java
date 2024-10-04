package com.api.api.service.impl;

import com.api.api.model.DetalleOrden;
import com.api.api.repository.IDetalleRepository;
import com.api.api.service.IDetalleService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//////LOGICA DE NEGOCIO (VALIDACIONES, COMBERTIR OBJETOS, PROCESAR INFORMACION)
@NoArgsConstructor
@Service
public class DetalleServiceImpl implements IDetalleService {

    @Autowired
    private IDetalleRepository detalleRepository;


    @Override
    public List<DetalleOrden> findAll() {
        return detalleRepository.findAll();
    }

    @Override
    public DetalleOrden save(DetalleOrden detalleOrden) {
        return detalleRepository.save(detalleOrden);
    }
}
