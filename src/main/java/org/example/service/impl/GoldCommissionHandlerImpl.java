package org.example.service.impl;

import org.example.model.Card;
import org.example.service.interfaces.CommissionHandler;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class GoldCommissionHandlerImpl implements CommissionHandler {
    @Override
    public BigDecimal getCommission(BigDecimal amount) {
        System.out.println("GoldCommissionHandlerImpl invoked");
        return  BigDecimal.ZERO;
    }

    @Override
    public boolean isApplicable(Card.CardType cardType) {
        return cardType.equals(Card.CardType.GOLD);
    }
}
