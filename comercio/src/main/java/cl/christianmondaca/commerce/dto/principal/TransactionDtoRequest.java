package cl.christianmondaca.commerce.dto.principal;


import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionDtoRequest implements Serializable {
    private Long id;
    /*dd/MM/yyyyHH: mm: ss example: 22/01/2022 13:44:25 */
    private LocalDateTime startDate;
    private int type;
    private String typeName;
    private HeaderDtoRequest headerDtoRequest;
    private BodyDtoRequest bodyDtoRequest;
    private FootDtoRequest footDtoRequest;
    private AdditionalDtoRequest additionalDtoRequest;
}
