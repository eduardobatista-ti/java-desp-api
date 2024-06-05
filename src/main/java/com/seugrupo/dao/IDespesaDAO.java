package com.seugrupo.dao;

import com.seugrupo.model.Categoria;
import com.seugrupo.model.Despesa;
import java.util.Optional;
import com.sun.tools.javac.util.List;


public interface IDespesaDAO {
    Despesa save(Despesa despesa);
    Despesa update(Despesa despesa);
    void delete(Long id);
    List<Despesa> findAll();
    Optional<Despesa> findById(Long id);
    List<Despesa> findByCategoria(Categoria categoria);
}
