package com.example.service;

import com.example.dto.CardDTO;
import com.example.dto.MakeTransactionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TransactionService {
//    private String cardServiceURL = "http://localhost:8081/card";
    @Autowired
    private  RestTemplate restTemplate;

    public String make(MakeTransactionDTO dto) {
        // check cardEntity
        CardDTO fromCard = getCardByPan(dto.getFromCardNumber());
        CardDTO carTO = getCardByPan(dto.getToCardNumber());
        //
        return null;
    }

    public CardDTO getCardByPan(String pan) {
        ResponseEntity<CardDTO> response
                = restTemplate.getForEntity("http://CART-SERVICE/card" + "/" + pan, CardDTO.class);
        return response.getBody();
    }

}
