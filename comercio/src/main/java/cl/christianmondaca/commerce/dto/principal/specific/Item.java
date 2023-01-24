package cl.christianmondaca.commerce.dto.principal.specific;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item implements Serializable {
    private int code;
    private String name;
    private String description;
    private String Float;
    private BigDecimal price;
    private BigDecimal discountAmount;
    private int discountCode;
}
