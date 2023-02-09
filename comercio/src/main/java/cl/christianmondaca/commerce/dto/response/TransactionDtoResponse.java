package cl.christianmondaca.commerce.dto.response;

import lombok.*;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionDtoResponse<T> {
    private T object;
}
