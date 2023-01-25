package cl.christianmondaca.commerce.persistence;

import cl.christianmondaca.commerce.entity.TransactionEntity;
import cl.christianmondaca.commerce.persistence.interfaces.IPersistenceCommerce;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class PersistenceMongoDB implements IPersistenceCommerce<TransactionEntity> {


    @Override
    public boolean save(TransactionEntity transactionEntity) {
        return false;
    }

    @Override
    public boolean saveAll(List<TransactionEntity> transactionEntities) {
        return false;
    }

    @Override
    public TransactionEntity get(Long id) {
        return null;
    }

    @Override
    public List<TransactionEntity> getAll() {
        return null;
    }
}
