package com.example.controller;

import com.example.dto.MakeTransactionDTO;
import com.example.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/make")
    public ResponseEntity<?> makeTransaction(@RequestBody MakeTransactionDTO dto) {
        return ResponseEntity.ok(transactionService.make(dto));
    }
}
