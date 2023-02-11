package cl.christianmondaca.commerce.dto.principal;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionDtoRequest implements Serializable {
    @Schema(name = "id", required = true)
    private Long id;
    /*dd/MM/yyyyHH: mm: ss example: 22/01/2022 13:44:25 */
    @Schema(name = "startDate", required = true, example = "2023-02-10T20:30:00.000-05:0")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private LocalDateTime startDate;
    @Schema(name = "type", required = true)
    private int type;
    @Schema(name = "typeName", required = true)
    private String typeName;
    @Schema(name = "header", required = true)
    @JsonAlias("header")
    private HeaderDtoRequest header;
    @Schema(name = "body", required = true)
    @JsonAlias("body")
    private BodyDtoRequest body;
    @Schema(name = "foot", required = true)
    @JsonAlias("foot")
    private FootDtoRequest foot;
    @Schema(name = "additional", required = true)
    @JsonAlias("additional")
    private AdditionalDtoRequest additional;
}
