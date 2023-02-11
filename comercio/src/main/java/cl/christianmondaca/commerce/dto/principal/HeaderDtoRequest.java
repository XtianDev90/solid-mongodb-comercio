package cl.christianmondaca.commerce.dto.principal;

import cl.christianmondaca.commerce.dto.principal.specific.Store;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HeaderDtoRequest implements Serializable {
    @Schema(name = "store", required = true)
    private Store store;

}
