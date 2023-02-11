package cl.christianmondaca.commerce.dto.principal.specific;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Store implements Serializable {
    @Schema(name = "storeCode", required = true)
    private int storeCode;
    @Schema(name = "storeName", required = true)
    private String storeName;
}
