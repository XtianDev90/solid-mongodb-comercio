package cl.christianmondaca.commerce.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collation = "addiotionals")
@Data
public class AdditionalEntity implements Serializable {
}
