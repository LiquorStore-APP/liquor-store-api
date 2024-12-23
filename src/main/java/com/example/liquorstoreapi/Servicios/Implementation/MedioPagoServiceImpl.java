package com.example.liquorstoreapi.Servicios.Implementation;

import com.example.liquorstoreapi.Clases.Categoria;
import com.example.liquorstoreapi.Clases.MedioPago;
import com.example.liquorstoreapi.Repositorios.CategoriaRepository;
import com.example.liquorstoreapi.Repositorios.MedioPagoRepository;
import com.example.liquorstoreapi.Servicios.MedioPagoService;
import com.example.liquorstoreapi.dto.MedioPagoRequest;
import com.example.liquorstoreapi.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedioPagoServiceImpl implements MedioPagoService {
    @Autowired
    private MedioPagoRepository medioPagoRepository;
    @Override
    public MedioPago createMedioPago(MedioPagoRequest medioPagoRequest) {
        MedioPago newMedioPago = initMedioPago(medioPagoRequest); //
        return medioPagoRepository.save(newMedioPago);
    }

    @Override
    public List<MedioPago> findAllMedioPagos() {
        List<MedioPago> medioPagos = medioPagoRepository.findAll();
        return medioPagos;
    }

    @Override
    public MedioPago findMedioPagoById(int medioPagoId) {
        MedioPago medioPago = medioPagoRepository.findById(medioPagoId)
                .orElseThrow( () -> ResourceNotFoundException.byIndex("MedioPago", medioPagoId));
        return medioPago;
    }

    @Override
    public MedioPago initMedioPago(MedioPagoRequest medioPagoRequest) {
        MedioPago medioPago = new MedioPago();

        medioPago.setNombreMedioPago(medioPagoRequest.getNombreMedioPago());

        return medioPago;
    }
}
