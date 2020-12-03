package com.bcp.tipo_cambio.controller;

import com.bcp.tipo_cambio.Entity.EntityTipoCambio;
import com.bcp.tipo_cambio.services.TipoCambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api-bcp")
public class TipoCambioController {

    @Autowired
    TipoCambioService service;

    @GetMapping("obtener-lista-tipo-cambio")
    public List<EntityTipoCambio> obtenerListaTipoCambio(){
        return service.getListaTipoCambio();
    }
}
