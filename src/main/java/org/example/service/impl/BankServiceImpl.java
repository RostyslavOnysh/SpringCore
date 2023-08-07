package org.example.service.impl;

import org.example.model.User;
import org.example.service.interfaces.BankService;
import org.example.service.interfaces.CommissionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class BankServiceImpl implements BankService {
    @Autowired
    private CommissionHandler commissionHandler;

    @Override
    public void pay(int serviceId, BigDecimal amount, User user) {
        commissionHandler.getCommission(amount);
    }
}
