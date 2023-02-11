package cl.christianmondaca.commerce.services.interfaces;

import cl.christianmondaca.commerce.dto.principal.TransactionDtoRequest;

import java.util.List;

public interface ITransactionServices {
    boolean save(TransactionDtoRequest transactionDtoRequestDto);
    boolean saveAll(List<TransactionDtoRequest> transactionDtoRequestDtos);
    TransactionDtoRequest get(Long id);
    List<TransactionDtoRequest> getAllSort();
}
