package org.example.config;

import org.example.service.impl.GoldCommissionHandlerImpl;
import org.example.service.impl.UsualCommissionHandlerImpl;
import org.example.service.interfaces.CommissionHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {
    @Bean
    @Qualifier("goldCommissionHandler")
    public CommissionHandler goldCommissionHandler() {
        return new GoldCommissionHandlerImpl();
    }

    @Bean
    @Qualifier("usualCommissionHandler")
    public CommissionHandler usualCommissionHandler() {
        return new UsualCommissionHandlerImpl();
    }
}
