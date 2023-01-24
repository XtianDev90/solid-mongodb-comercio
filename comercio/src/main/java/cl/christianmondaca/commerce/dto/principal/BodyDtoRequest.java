package cl.christianmondaca.commerce.dto.principal;

import cl.christianmondaca.commerce.dto.principal.specific.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BodyDtoRequest implements Serializable {
    private Customer customer;
    private List<Item> items;
    private List<Discount> discounts;
    private Totals totals;
    private List<Payment> payments;

}
