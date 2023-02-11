package cl.christianmondaca.commerce.dto.principal;

import cl.christianmondaca.commerce.dto.principal.specific.ChangeTicket;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdditionalDtoRequest implements Serializable {
    @Schema(name = "changeTicket", required = true)
    private ChangeTicket changeTicket;
}
