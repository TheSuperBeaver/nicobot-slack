package com.st.nicobot;

import com.st.nicobot.bot.NicoBot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan
@EnableScheduling
@EnableAsync
@PropertySource("classpath:nicobot.properties")
@PropertySource(value = "classpath:slack.properties", ignoreResourceNotFound = true)
@PropertySource(value = "classpath:externalapis.properties", ignoreResourceNotFound = true)
public class BotMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		ApplicationContext context = new AnnotationConfigApplicationContext(BotMain.class);

		NicoBot session = context.getBean(NicoBot.class);

		session.connect();
	}
}
