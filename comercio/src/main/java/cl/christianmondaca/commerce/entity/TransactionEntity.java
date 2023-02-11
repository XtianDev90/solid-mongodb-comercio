package cl.christianmondaca.commerce.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;


@Document(collection = "transactions")
@Data
public class TransactionEntity implements Comparable<TransactionEntity> {
    @Id
    private Long id;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private LocalDateTime startDate;
    private int type;
    private String typeName;
    @Field(name = "header")
    private HeaderEntity header;
    @Field(name = "body")
    private BodyEntity body;
    @Field(name = "foot")
    private FootEntity foot;
    @Field(name = "additional")
    private AdditionalEntity additional;

    @Override
    public int compareTo(TransactionEntity o) {
        return this.id.compareTo(o.id);
    }
}
