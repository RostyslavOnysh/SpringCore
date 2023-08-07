package org.example.service.interfaces;

import org.example.model.Card;

import java.math.BigDecimal;

public interface CommissionHandler {
    BigDecimal getCommission(BigDecimal amount);

    boolean isApplicable(Card.CardType cardType);
}
