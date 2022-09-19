package com.mycompany.healthybot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.core.env.Environment;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HealthyBotApplication {


	public static void main(String[] args) {

		SpringApplication.run(HealthyBotApplication.class, args);
		SpringApplication.run(HealthyBotApplication.class, args);
		try {
			TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
			botsApi.registerBot(new HealthyBot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

}
