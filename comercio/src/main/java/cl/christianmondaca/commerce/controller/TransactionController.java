package cl.christianmondaca.commerce.controller;

import cl.christianmondaca.commerce.dto.principal.TransactionDtoRequest;
import cl.christianmondaca.commerce.dto.response.TransactionDtoResponse;
import cl.christianmondaca.commerce.services.TransactionServices;
import cl.christianmondaca.commerce.services.interfaces.ITransactionServices;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commerce")
@RequiredArgsConstructor
public class TransactionController {
    @Autowired
    private ITransactionServices transactionServices;

    @GetMapping("/transactions/transaction/{id}")
    public ResponseEntity<TransactionDtoResponse> getTransactionById(@PathVariable Long id){
        TransactionDtoResponse response = transactionServices.get(id);
        return new ResponseEntity<TransactionDtoResponse>(response,null, HttpStatus.OK);
    }

    @GetMapping("/transactions")
    public ResponseEntity<List<TransactionDtoResponse>> getAllTransactions(){
        List<TransactionDtoResponse> response = transactionServices.getAll();
        return new ResponseEntity<List<TransactionDtoResponse>>(response,null, HttpStatus.OK);
    }

    @PostMapping("/transactions/transaction")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveTransaction(TransactionDtoRequest transactionDtoRequest){
        transactionServices.save(transactionDtoRequest);
    }

    @PostMapping("/transactions")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAllTransactions(List<TransactionDtoRequest> transactionDtoRequests){
        transactionServices.saveAll(transactionDtoRequests);
    }
}
