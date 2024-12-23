package com.example.liquorstoreapi.Servicios;

import com.example.liquorstoreapi.Clases.Categoria;
import com.example.liquorstoreapi.Clases.MedioPago;
import com.example.liquorstoreapi.dto.CategoriaRequest;
import com.example.liquorstoreapi.dto.MedioPagoRequest;

import java.util.List;

public interface MedioPagoService {
    MedioPago createMedioPago(MedioPagoRequest medioPagoRequest);

    List<MedioPago> findAllMedioPagos();

    MedioPago findMedioPagoById(int medioPagoId) ;

    MedioPago initMedioPago(MedioPagoRequest medioPagoRequest);
}
