package cl.christianmondaca.commerce.dto.principal.specific;

import lombok.*;

import java.io.Serializable;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Store implements Serializable {
    private int storeCode;
    private String storeName;
}
