package com.example.springdemo;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.example.springdemo.library.enums.GameType;
import com.example.springdemo.library.games.IGame;
import com.example.springdemo.library.games.OusYetGame;
import com.example.springdemo.library.games.TienLenGame;

@Component
public class GameManager implements IGameManager {
	private Scanner _scanner = new Scanner(System.in);
	private ConfigurableApplicationContext _context;
	
	public GameManager(ConfigurableApplicationContext context) {
		_context = context;
	}

	@Override
	public void start() {
		GameType[] gameTypes = {GameType.TienLen, GameType.OusYet};
		
		IGame game = null;
		
		int gameId = 1;
		do {
			gameId = askToPickGame();
		} while(gameId >= gameTypes.length);
		
		switch(gameTypes[gameId]) {
			case TienLen:
				game = _context.getBean(TienLenGame.class);
				break;
			case OusYet:
				game = _context.getBean(OusYetGame.class);
				break;
			default:
		}
		
		game.play();
	}
	
	private int askToPickGame() {
		System.out.println("0.TieLen Game");
		System.out.println("1.OusYet Game");
		System.out.print("Please Choose Game to Play: ");
		return _scanner.nextInt();
	}

}
