package cl.christianmondaca.commerce.entity;

import cl.christianmondaca.commerce.dto.principal.specific.ChangeTicket;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "additionals")
@Data
public class AdditionalEntity implements Serializable {
    private ChangeTicket changeTicket;
}
