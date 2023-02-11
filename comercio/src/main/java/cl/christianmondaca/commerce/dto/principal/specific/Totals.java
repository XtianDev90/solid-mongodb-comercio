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
public class Totals implements Serializable {
    @Schema(name = "total", required = true)
    private BigDecimal total;
    @Schema(name = "subTotal", required = true)
    private BigDecimal subTotal;
    @Schema(name = "totalDiscounts", required = true)
    private BigDecimal totalDiscounts;
    @Schema(name = "totalPayments", required = true)
    private BigDecimal totalPayments;
}
