package ru.gb.onlineShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableConfigServer
@SpringBootApplication
public class OnlineShopServerApp {
    public static void main(String[] args) {
        SpringApplication.run(OnlineShopServerApp.class);
    }
}
