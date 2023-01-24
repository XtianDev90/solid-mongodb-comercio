package cl.christianmondaca.commerce.dto.principal;

import cl.christianmondaca.commerce.dto.principal.specific.Store;
import lombok.*;

import java.io.Serializable;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HeaderDtoRequest implements Serializable {
    private Store store;

}
