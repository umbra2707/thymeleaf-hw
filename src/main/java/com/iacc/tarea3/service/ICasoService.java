package com.iacc.tarea3.service;

import com.iacc.tarea3.model.Caso;
import java.util.List;

public interface ICasoService {

    List<Caso> listarTodos();

    void guardar(Caso caso);

    Caso buscarPorId(Integer id);

    void eliminar(Integer id);

    Caso actualizar(Caso caso);
}
