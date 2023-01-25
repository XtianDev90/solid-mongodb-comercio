package cl.christianmondaca.commerce.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collation = "transactions")
public class TransactionEntity{
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
}
