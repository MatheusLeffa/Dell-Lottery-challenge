package com.dell.lottery;

import com.dell.lottery.view.MainMenu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class LotteryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		new SpringApplicationBuilder(LotteryApplication.class).headless(false).run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		MainMenu mainMenu = new MainMenu();
		mainMenu.startUpMainMenu();
	}
}
