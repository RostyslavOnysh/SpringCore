package org.example.service.impl;

import org.example.model.Card;
import org.example.service.interfaces.CommissionHandler;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Component
public class SilverCommissionHandlerImpl implements CommissionHandler {
    @Override
    public BigDecimal getCommission(BigDecimal amount) {
        return null;
    }

    @Override
    public boolean isApplicable(Card.CardType cardType) {
        return false;
    }
}
