package cl.christianmondaca.commerce;

import cl.christianmondaca.commerce.factory.PersistenceMongoDBFactory;
import cl.christianmondaca.commerce.factory.interfaces.IPersistenceFactoryCommerce;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ComercioApplication {


	public static void main(String[] args) {
		SpringApplication.run(ComercioApplication.class, args);
	}

	@PostConstruct
	public IPersistenceFactoryCommerce startPersistence(){
		return new PersistenceMongoDBFactory();
	}
}
