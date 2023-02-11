package cl.christianmondaca.commerce.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "foots")
@Getter
@Setter
public class FootEntity implements Serializable {
    private String barcode;
}
