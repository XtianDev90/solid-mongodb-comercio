package cl.christianmondaca.commerce.dto.principal.specific;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer implements Serializable {
    @Schema(name = "IdentificationNumber", required = true)
    private Long IdentificationNumber;
    @Schema(name = "verificationDigit", required = true)
    private String verificationDigit;
    @Schema(name = "firstName", required = true)
    private String firstName;
    @Schema(name = "lastName", required = true)
    private String lastName;
}
