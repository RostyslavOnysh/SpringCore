package org.example.service.impl;

import org.example.model.Card;
import org.example.service.interfaces.CommissionHandler;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Primary
public class UsualCommissionHandlerImpl implements CommissionHandler {
    @Override
    public BigDecimal getCommission(BigDecimal amount) {
        System.out.println("UsualCommissionHandlerImpl invoked");
        return amount.multiply(BigDecimal.valueOf(0.05));
    }

    @Override
    public boolean isApplicable(Card.CardType cardType) {
        return cardType.equals(Card.CardType.USUAL);
    }
}
