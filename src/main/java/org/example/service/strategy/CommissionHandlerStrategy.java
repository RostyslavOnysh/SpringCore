package org.example.service.strategy;

import org.example.model.Card;
import org.example.service.interfaces.CommissionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
public class CommissionHandlerStrategy {
    @Autowired
    private List<CommissionHandler> commissionHandlers;

    public CommissionHandler getHandler(Card.CardType cardType) {

        return commissionHandlers.stream()
                .filter(h -> h.isApplicable(cardType))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }
}
