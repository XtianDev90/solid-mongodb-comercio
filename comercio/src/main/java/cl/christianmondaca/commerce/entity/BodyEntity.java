package cl.christianmondaca.commerce.entity;

import cl.christianmondaca.commerce.dto.principal.specific.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document(collection = "bodies")
@Getter
@Setter
public class BodyEntity implements Serializable {

    private Customer customer;

    private List<Item> items;

    private List<Discount> discounts;

    private Totals totals;

    private List<Payment> payments;
}
