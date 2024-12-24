package com.example.liquorstoreapi.Controladores;

import com.example.liquorstoreapi.Clases.Venta;
import com.example.liquorstoreapi.Servicios.VentaService;
import com.example.liquorstoreapi.dto.VentaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class ControladorVenta {
    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<Venta> sells(){
        return ventaService.findAllVenta();
    }

    @PostMapping
    public Venta createVenta(@RequestBody VentaRequest ventaRequest){
        return ventaService.createVenta(ventaRequest);
    }
}
