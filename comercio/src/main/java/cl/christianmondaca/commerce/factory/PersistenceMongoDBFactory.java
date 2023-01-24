package cl.christianmondaca.commerce.factory;

import cl.christianmondaca.commerce.persistence.IPersistenceCommerce;
import cl.christianmondaca.commerce.repository.interfaces.PersistenceMongoDB;

public class PersistenceMongoDBFactory implements IPersistenceFactoryCommerce{
    @Override
    public IPersistenceCommerce getPersistenceCommerce() {
        return new PersistenceMongoDB();
    }
}
