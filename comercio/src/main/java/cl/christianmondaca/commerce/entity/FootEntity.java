package cl.christianmondaca.commerce.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collation = "transactions")
@Getter
@Setter
public class FootEntity implements Serializable {
}
