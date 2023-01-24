package cl.christianmondaca.commerce.dto.principal.specific;

import lombok.*;

import java.io.Serializable;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer implements Serializable {

    private Long IdentificationNumber;
    private String verificationDigit;
    private String firstName;
    private String lastName;
}
