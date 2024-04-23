package com.iacc.tarea3.service;

import com.iacc.tarea3.model.Caso;
import com.iacc.tarea3.repository.CasoRepository;
import org.hibernate.id.IntegralDataTypeHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CasoService implements ICasoService {

    @Autowired
    private CasoRepository casos;
    @Override
    public List<Caso> listarTodos() {
        return (List<Caso>) casos.findAll();
    }

    @Override
    public void guardar(Caso caso) {
        casos.save(caso);
    }

    @Override
    public Caso buscarPorId(Integer id) {
        Caso caso = casos.findById(id).orElse(null);
        return caso;
    }

    @Override
    public void eliminar(Integer id) {
        casos.deleteById(id);
    }

    @Override
    public Caso actualizar(Caso caso) {
        return casos.save(caso);
    }
}
