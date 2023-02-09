package cl.christianmondaca.commerce.services.interfaces;

import cl.christianmondaca.commerce.dto.principal.TransactionDtoRequest;

import java.util.List;

public interface ITransactionServices {
    boolean save(TransactionDtoRequest transactionDto);
    boolean saveAll(List<TransactionDtoRequest> transactionDtos);
    TransactionDtoRequest get(Long id);
    List<TransactionDtoRequest> getAllSort();
}
