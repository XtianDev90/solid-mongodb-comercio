package cl.christianmondaca.commerce.entity;

import cl.christianmondaca.commerce.dto.principal.specific.Store;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "headers")
@Data
public class HeaderEntity implements Serializable {
    private Store store;
}
