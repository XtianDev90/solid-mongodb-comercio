package cl.christianmondaca.commerce.services;

import cl.christianmondaca.commerce.dto.principal.TransactionDtoRequest;
import cl.christianmondaca.commerce.dto.response.TransactionDtoResponse;
import cl.christianmondaca.commerce.entity.TransactionEntity;
import cl.christianmondaca.commerce.repository.TransactionRepository;
import cl.christianmondaca.commerce.services.interfaces.ITransactionServices;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class TransactionServices implements ITransactionServices {

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    protected TransactionRepository transactionRepository;
    @Override
    public boolean save(TransactionDtoRequest transactionDtoRequest) {
        TransactionEntity transactionEntity = modelMapper.map(transactionDtoRequest, TransactionEntity.class);

        return transactionRepository.save(transactionEntity);

    }

    @Override
    public boolean saveAll(List<TransactionDtoRequest> transactionDtoRequestDtos) {
        List<TransactionEntity> transactionEntities = new ArrayList<>();
        return transactionRepository.saveAll(transactionEntities);
    }

    @Override
    public TransactionDtoRequest get(Long id) {
        TransactionEntity transactionEntity = transactionRepository.get(id);

        TransactionDtoRequest orderDTO = modelMapper.map(transactionEntity, TransactionDtoRequest.class);
        TransactionDtoResponse<TransactionDtoRequest> response = new TransactionDtoResponse<>();
        response.setObject(orderDTO);
        return orderDTO;
    }

    @Override
    public List<TransactionDtoRequest> getAllSort() {
        Stream<List<TransactionEntity>>  transactionEntities = Stream.of(transactionRepository.getAllSort());
        List<TransactionDtoRequest>  mappedList = transactionEntities
                .map((entity)-> modelMapper.map(entity, TransactionDtoRequest.class))
                .collect(Collectors.toList());

        return mappedList;
    }
}
