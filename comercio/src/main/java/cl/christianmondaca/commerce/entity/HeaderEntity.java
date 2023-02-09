package cl.christianmondaca.commerce.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collation = "headers")
@Data
public class HeaderEntity implements Serializable {
}
