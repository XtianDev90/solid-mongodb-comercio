package cl.christianmondaca.commerce.dto.principal;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FootDtoRequest implements Serializable {
    @Schema(name = "barcode", required = true)
    private String barcode;
}
