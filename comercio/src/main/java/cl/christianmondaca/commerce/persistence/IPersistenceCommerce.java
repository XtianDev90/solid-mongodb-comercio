package cl.christianmondaca.commerce.persistence;

import cl.christianmondaca.commerce.entity.TransactionEntity;

import java.util.List;

public interface IPersistenceCommerce<T> {

    boolean save(T t);
    boolean saveAll(List<T> ts);
    TransactionEntity get(Long id);
    List<T> getAll();
}
