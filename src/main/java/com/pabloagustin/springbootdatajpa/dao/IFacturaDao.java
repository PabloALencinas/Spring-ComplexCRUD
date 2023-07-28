package com.pabloagustin.springbootdatajpa.dao;

import com.pabloagustin.springbootdatajpa.models.Factura;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface IFacturaDao extends CrudRepository<Factura, Long> {

    // Metodo para realizar la consulta de una sola vez, en vez de LAZY (perezosa)
    @Query("select f from Factura f join fetch f.cliente c join fetch f.items l join fetch l.producto where f.id=?1")
    public Factura fetchByIdWithClienteWithItemFacturaWithProducto(Long id);
}
