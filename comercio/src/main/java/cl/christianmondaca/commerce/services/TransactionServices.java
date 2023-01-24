package cl.christianmondaca.commerce.services;

import cl.christianmondaca.commerce.dto.principal.TransactionDtoRequest;
import cl.christianmondaca.commerce.dto.response.TransactionDtoResponse;
import cl.christianmondaca.commerce.entity.TransactionEntity;
import cl.christianmondaca.commerce.repository.TransactionRepository;
import cl.christianmondaca.commerce.repository.interfaces.ITransactionRepository;
import cl.christianmondaca.commerce.services.interfaces.ITransactionServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@Service
@AllArgsConstructor
public class TransactionServices implements ITransactionServices {

    protected TransactionRepository transactionRepository;
    @Override
    public boolean save(TransactionDtoRequest transactionDtoRequest) {
        TransactionEntity transactionEntity = new TransactionEntity();
        return transactionRepository.save(transactionEntity);

    }

    @Override
    public boolean saveAll(List<TransactionDtoRequest> transactionDtos) {
        List<TransactionEntity> transactionEntities = new ArrayList<>();
        return transactionRepository.saveAll(transactionEntities);
    }

    @Override
    public TransactionDtoResponse get(Long id) {
        TransactionEntity transactionEntity = transactionRepository.get(id);
        Function<TransactionEntity, TransactionDtoRequest> function;
        TransactionDtoResponse response = new TransactionDtoResponse();
        return response;
    }

    @Override
    public List<TransactionDtoResponse> getAll() {
        List<TransactionEntity> transactionEntities = transactionRepository.getAll();
        Function<TransactionEntity, TransactionDtoRequest> function;
        List<TransactionDtoResponse>  response = new ArrayList<>();
        return response;
    }
}
