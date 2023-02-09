package cl.christianmondaca.commerce.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collation = "transactions")
@Data
public class TransactionEntity implements Comparable<TransactionEntity> {
    @Id
    private Long id;
    @Field
    private HeaderEntity headerEntity;
    @Field
    private BodyEntity bodyEntity;
    @Field
    private FootEntity footEntity;
    @Field
    private AdditionalEntity additionalEntity;

    @Override
    public int compareTo(TransactionEntity o) {
        return this.id.compareTo(o.id);
    }
}
