package com.example.liquorstoreapi.Servicios.Implementation;

import com.example.liquorstoreapi.Clases.DetalleVenta;
import com.example.liquorstoreapi.Clases.MedioPago;
import com.example.liquorstoreapi.Clases.Producto;
import com.example.liquorstoreapi.Clases.Ventas;
import com.example.liquorstoreapi.Repositorios.ProductoRepository;
import com.example.liquorstoreapi.Repositorios.VentaRepository;
import com.example.liquorstoreapi.Servicios.CategoriaService;
import com.example.liquorstoreapi.Servicios.MedioPagoService;
import com.example.liquorstoreapi.Servicios.VentaService;
import com.example.liquorstoreapi.dto.VentaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaServiceImpl implements VentaService {
    @Autowired
    private VentaRepository ventaRepository;
    @Autowired
    private MedioPagoService medioPagoService;

    @Override
    public Ventas createVenta(VentaRequest ventaRequest) {
        Ventas newVenta = initVenta(ventaRequest);
        DetalleVenta newDetalleVenta = initDetalleVenta(ventaRequest);
        return ventaRepository.save(newVenta);
    }

    @Override
    public List<Ventas> findAllVenta() {
        return null;
    }

    @Override
    public Ventas initVenta(VentaRequest ventaRequest) {
        MedioPago medioPago = medioPagoService.findMedioPagoById(ventaRequest.getIdMedioPagoVenta());

        Ventas venta = new Ventas();
        venta.setClienteVenta(ventaRequest.getNombreCliente());
        venta.setFechaVenta(ventaRequest.getFechaVenta());
        venta.setMontoTotalVenta(ventaRequest.getMontoTotalVenta());
        venta.setUtilidadTotalVenta(ventaRequest.getUtilidadTotalVenta());
        venta.setIdMedioPagoVenta(medioPago);
        return venta;
    }

    @Override
    public DetalleVenta initDetalleVenta(VentaRequest ventaRequest) {
        return null;
    }

    @Override
    public void deleteSaleById(int ventaId) {

    }

    @Override
    public List<Ventas> findVentasByDescription(String desc) {
        return null;
    }
}
