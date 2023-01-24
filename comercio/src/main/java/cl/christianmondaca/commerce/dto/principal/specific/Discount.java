package cl.christianmondaca.commerce.dto.principal.specific;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Discount implements Serializable {
    private int code;
    private String name;
    private String description;
    private BigDecimal amount;
}
