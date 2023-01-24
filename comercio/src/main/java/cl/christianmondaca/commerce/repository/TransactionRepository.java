package cl.christianmondaca.commerce.repository;

import cl.christianmondaca.commerce.entity.TransactionEntity;
import cl.christianmondaca.commerce.factory.IPersistenceFactoryCommerce;
import cl.christianmondaca.commerce.factory.PersistenceMongoDBFactory;
import cl.christianmondaca.commerce.persistence.IPersistenceCommerce;
import cl.christianmondaca.commerce.repository.interfaces.ITransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository("Transaction")
public class TransactionRepository implements ITransactionRepository {

    protected IPersistenceCommerce iPersistenceCommerce;

    @Autowired
    public void TransactionRepository(){
        IPersistenceFactoryCommerce iPersistenceFactoryCommerce = new PersistenceMongoDBFactory();
        this.iPersistenceCommerce = iPersistenceFactoryCommerce.getPersistenceCommerce();
    }

    @Override
    public boolean save(TransactionEntity transactionEntity) {
        /*Guardar en Repositorio: MongoDb, Redis , SQL , etc.*/
        iPersistenceCommerce.save(transactionEntity);
        return true;
    }

    @Override
    public boolean saveAll(List<TransactionEntity> transactionEntities) {
        /*Guardar en Repositorio: MongoDb, Redis , SQL , etc.*/
        iPersistenceCommerce.saveAll(transactionEntities);
        return true;
    }

    @Override
    public TransactionEntity get(Long id) {
        /*Obtener en Repositorio: MongoDb, Redis , SQL , etc.*/
        iPersistenceCommerce.get(id);
        return new TransactionEntity();
    }

    @Override
    public List<TransactionEntity> getAll() {
        /*Obtener en Repositorio: MongoDb, Redis , SQL , etc.*/
        iPersistenceCommerce.getAll();
        return new ArrayList<TransactionEntity>();
    }
}
