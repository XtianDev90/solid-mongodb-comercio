package cl.christianmondaca.commerce.repository.interfaces;

import cl.christianmondaca.commerce.entity.TransactionEntity;
import cl.christianmondaca.commerce.persistence.IPersistenceCommerce;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class PersistenceMongoDB implements IPersistenceCommerce<TransactionEntity> {

    @Override
    @Query
    public boolean save(TransactionEntity transactionEntity) {
        /*Query para conectarse y guardar un trx en mongo DB*/
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
