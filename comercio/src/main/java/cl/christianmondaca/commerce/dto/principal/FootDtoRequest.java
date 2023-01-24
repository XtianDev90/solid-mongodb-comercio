package cl.christianmondaca.commerce.dto.principal;

import lombok.*;

import java.io.Serializable;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FootDtoRequest implements Serializable {
    private String barcode;
}
