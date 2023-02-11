package cl.christianmondaca.commerce.dto.principal;

import cl.christianmondaca.commerce.dto.principal.specific.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BodyDtoRequest implements Serializable {
    @Schema(name = "customer", required = true)
    private Customer customer;
    @Schema(name = "items", required = true)
    private List<Item> items;
    @Schema(name = "discounts", required = true)
    private List<Discount> discounts;
    @Schema(name = "totals", required = true)
    private Totals totals;
    @Schema(name = "payments", required = true)
    private List<Payment> payments;

}
