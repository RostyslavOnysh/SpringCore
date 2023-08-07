package org.example;

import org.example.config.AppConfig;
import org.example.model.Card;
import org.example.model.User;
import org.example.service.interfaces.BankService;
import org.example.service.interfaces.CommissionHandler;
import org.example.service.strategy.CommissionHandlerStrategy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        User bob = new User("Bob","Alison");
        Card bobsCars = new Card("1234", Card.CardType.USUAL);
        bob.setCard(bobsCars);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CommissionHandlerStrategy handlerStrategy = context.getBean(CommissionHandlerStrategy.class);
        CommissionHandler handler = handlerStrategy.getHandler(Card.CardType.USUAL);
        handler.getCommission(BigDecimal.valueOf(100));
    }
}
