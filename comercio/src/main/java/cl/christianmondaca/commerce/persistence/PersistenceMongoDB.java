package cl.christianmondaca.commerce.persistence;

import cl.christianmondaca.commerce.entity.TransactionEntity;
import cl.christianmondaca.commerce.persistence.interfaces.IPersistenceCommerce;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class PersistenceMongoDB implements IPersistenceCommerce<TransactionEntity> {

    MongoClient mongoClient = new MongoClient("localhost",27017);
    @Autowired
    ModelMapper modelMapper;
    @Override
    public boolean save(TransactionEntity transactionEntity) {
        MongoDatabase database = mongoClient.getDatabase("mongodb");
        MongoCollection<TransactionEntity> collection = database
                .getCollection("transactions", TransactionEntity.class);
        collection.insertOne(transactionEntity);
        return true;
    }

    @Override
    public boolean saveAll(List<TransactionEntity> transactionEntities) {
        //iRepositoryMongoDBExtension.saveAll(transactionEntities);
        return false;
    }

    @Override
    public TransactionEntity get(Long id) {
        MongoDatabase database = mongoClient.getDatabase("mongodb");
        FindIterable<TransactionEntity> collection = database
                .getCollection("transactions", TransactionEntity.class).find(Filters.eq("transaction.id", id));

        return collection.first();
    }

    @Override
    public List<TransactionEntity> getAllSort() {
        MongoDatabase database = mongoClient.getDatabase("mongodb");
        MongoCollection<TransactionEntity> collection = database
                .getCollection("transactions", TransactionEntity.class);

        List<TransactionEntity> transactionEntities = collection.find().into(new ArrayList<TransactionEntity>());

        return transactionEntities;
    }
}
