package cl.christianmondaca.commerce.dto.principal.specific;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item implements Serializable {
    @Schema(name = "IdentificationNumber", required = true)
    private int code;
    @Schema(name = "IdentificationNumber", required = true)
    private String name;
    @Schema(name = "IdentificationNumber", required = true)
    private String description;
    @Schema(name = "quantity", required = true)
    private Float quantity;
    @Schema(name = "price", required = true)
    private BigDecimal price;
    @Schema(name = "discountAmount", required = true)
    private BigDecimal discountAmount;
    @Schema(name = "discountCode", required = true)
    private int discountCode;
}
