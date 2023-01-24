package cl.christianmondaca.commerce.services.interfaces;

import cl.christianmondaca.commerce.dto.principal.TransactionDtoRequest;
import cl.christianmondaca.commerce.dto.response.TransactionDtoResponse;

import java.util.List;

public interface ITransactionServices {
    boolean save(TransactionDtoRequest transactionDto);
    boolean saveAll(List<TransactionDtoRequest> transactionDtos);
    TransactionDtoResponse get(Long id);
    List<TransactionDtoResponse> getAll();
}
