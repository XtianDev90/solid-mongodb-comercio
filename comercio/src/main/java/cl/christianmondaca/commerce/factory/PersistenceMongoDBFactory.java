package cl.christianmondaca.commerce.factory;

import cl.christianmondaca.commerce.factory.interfaces.IPersistenceFactoryCommerce;
import cl.christianmondaca.commerce.persistence.PersistenceMongoDB;
import cl.christianmondaca.commerce.persistence.interfaces.IPersistenceCommerce;

public class PersistenceMongoDBFactory implements IPersistenceFactoryCommerce {
    @Override
    public IPersistenceCommerce getPersistenceCommerce() {
        return new PersistenceMongoDB();
    }
}
