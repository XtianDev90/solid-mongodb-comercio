package cl.christianmondaca.commerce.repository.interfaces;

import cl.christianmondaca.commerce.entity.TransactionEntity;

import java.util.List;

public interface ITransactionRepository {
    boolean save(TransactionEntity transactionEntity);
    boolean saveAll(List<TransactionEntity> transactionEntities);
    TransactionEntity get(Long id);
    List<TransactionEntity> getAllSort();
}
