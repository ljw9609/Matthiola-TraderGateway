package com.cts.trader;

import com.cts.trader.utils.SpringUtil;
import com.cts.trader.websocket.GatewaySocketClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableJpaRepositories("com.cts.trader.repository")
@EntityScan("com.cts.trader.model")
@ComponentScan(basePackages = "com.cts.trader")
@EnableCaching
@EnableScheduling
public class TraderApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TraderApplication.class, args);
        SpringUtil.setApplicationContext1(applicationContext);
	}
}
