package cl.christianmondaca.commerce.dto.principal.specific;

import lombok.*;

import java.io.Serializable;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChangeTicket implements Serializable {
    private String code;
    private Long idTransaction;
}
