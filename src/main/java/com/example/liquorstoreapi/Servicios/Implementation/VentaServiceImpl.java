package com.example.liquorstoreapi.Servicios.Implementation;

import com.example.liquorstoreapi.Clases.DetalleVenta;
import com.example.liquorstoreapi.Clases.MedioPago;
import com.example.liquorstoreapi.Clases.Venta;
import com.example.liquorstoreapi.Repositorios.VentaRepository;
import com.example.liquorstoreapi.Servicios.MedioPagoService;
import com.example.liquorstoreapi.Servicios.VentaService;
import com.example.liquorstoreapi.dto.VentaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class VentaServiceImpl implements VentaService {
    @Autowired
    private VentaRepository ventaRepository;
    @Autowired
    private MedioPagoService medioPagoService;

    @Override
    @Transactional
    public Venta createVenta(VentaRequest ventaRequest) {
        Venta newVenta = initVenta(ventaRequest);
        List<DetalleVenta> detalleVentaList = initDetalleVenta(ventaRequest);
        newVenta.setDetalleVentas(detalleVentaList);
        return ventaRepository.save(newVenta);
    }

    @Override
    public List<Venta> findAllVenta() {
        return ventaRepository.findAll();
    }

    public Venta initVenta(VentaRequest ventaRequest) {
        MedioPago medioPago = medioPagoService.findMedioPagoById(ventaRequest.getIdMedioPagoVenta());

        Venta venta = new Venta();
        venta.setClienteVenta(ventaRequest.getNombreCliente());
        venta.setFechaVenta(ventaRequest.getFechaVenta());
        venta.setIdMedioPagoVenta(medioPago);
        venta.setMontoTotalVenta(ventaRequest.getMontoTotalVenta());
        venta.setUtilidadTotalVenta(ventaRequest.getUtilidadTotalVenta());
        return venta;
    }

    public List<DetalleVenta> initDetalleVenta(VentaRequest ventaRequest) {
        return ventaRequest.getDetalleVenta().stream().map(detalleVentaRequest -> {
                    DetalleVenta detalleVenta = new DetalleVenta();
                    detalleVenta.setCantidadDetalleVenta(detalleVentaRequest.getCantidadDetalleVenta());
                    detalleVenta.setPrecioDetalleVenta(detalleVentaRequest.getPrecioDetalleVenta());
                    detalleVenta.setSubutilidadDetalleVenta(detalleVentaRequest.getSubutilidadDetalleVenta());
                    detalleVenta.setProductoDetalleVenta(detalleVentaRequest.getProductoDetalleVenta());
                    detalleVenta.setSubTotalDetalleVenta(detalleVentaRequest.getSubTotalDetalleVenta());
                    return detalleVenta;
                }
            ).collect(toList());
    }

    @Override
    public void deleteSaleById(int ventaId) {

    }

    @Override
    public List<Venta> findVentasByDescription(String desc) {
        return null;
    }
}
