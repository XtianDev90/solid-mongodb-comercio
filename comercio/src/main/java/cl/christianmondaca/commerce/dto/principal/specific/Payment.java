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
public class Payment implements Serializable {
    @Schema(name = "code", required = true)
    private int code;
    @Schema(name = "name", required = true)
    private String name;
    @Schema(name = "amount", required = true)
    private BigDecimal amount;
}
