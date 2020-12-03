package com.bcp.tipo_cambio.services;

import com.bcp.tipo_cambio.Entity.EntityTipoCambio;
import com.bcp.tipo_cambio.dao.TipoCambioDao;
import com.bcp.tipo_cambio.model.TipoCambioInput;
import com.bcp.tipo_cambio.model.TipoCambioOuput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoCambioServiceImpl implements TipoCambioService {

    @Autowired
    private TipoCambioDao dao;

    @Override
    public TipoCambioOuput getTipoCambio(TipoCambioInput input) {

        TipoCambioOuput resultado = new TipoCambioOuput();

        return null;
    }

    @Override
    public List<EntityTipoCambio> getListaTipoCambio() {
        return (List<EntityTipoCambio>)dao.findAll();
    }
}
