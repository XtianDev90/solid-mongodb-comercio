package cl.christianmondaca.commerce.persistence.interfaces;

import java.util.List;

public interface IPersistenceCommerce<T> {

    boolean save(T t);
    boolean saveAll(List<T> ts);
    T get(Long id);
    List<T> getAllSort();
}
