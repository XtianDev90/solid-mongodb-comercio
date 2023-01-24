package cl.christianmondaca.commerce.dto.principal.specific;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Totals implements Serializable {
    private BigDecimal total;
    private BigDecimal subTotal;
    private BigDecimal totalDiscounts;
    private BigDecimal totalPayments;
}
