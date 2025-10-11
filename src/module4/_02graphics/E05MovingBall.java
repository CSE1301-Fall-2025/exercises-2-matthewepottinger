package module4._02graphics;

import java.awt.Color;
import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

public class E05MovingBall {

	/*
	 * Exercise: Read and run the code below and make sure you
	 * understand how it works before proceeding.
	 */
	public static void main(String[] args) {
		//balldynamics
		int numberOfBalls = 3;
		double[] ballX = new double[numberOfBalls];
		double[] ballXVelocity = new double[numberOfBalls];
		double[] ballY = new double[numberOfBalls];
		double[] ballYVelocity = new double[numberOfBalls];

		for(int i = 0; i < numberOfBalls; i++) {
			ballX[i] = Math.random();
			ballY[i] = Math.random();
			ballXVelocity[i] = Math.random() * 0.05;
			ballYVelocity[i] = Math.random() * 0.05;
		}

		//playerdynamics
		double playerX = 0.5;
		double playerY = 0.5;
		double playerVelocity = 0.01;

		int score = 0;
		int highScore = 0;
		long currentTime = System.currentTimeMillis();
		int newHighScore = 0;
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.05);
		
		while (true) {
			
			//Clear the canvas
			StdDraw.clear();
			
			//update the ball position for each ball
			for(int i = 0; i < numberOfBalls; i++) {
				ballX[i] = ballX[i] + ballXVelocity[i];
				if(ballX[i] > 1 || ballX[i] < 0) { //bounce if
					ballXVelocity[i] = -ballXVelocity[i]; //bounce by switching velocity
				}
				ballY[i] = ballY[i] + ballYVelocity[i];
				if(ballY[i] > 1 || ballY[i] < 0) { //bounce if
					ballYVelocity[i] = -ballYVelocity[i]; //bounce by switching velocity
				}
			}

			//Player movement
			if(StdDraw.isKeyPressed(KeyEvent.VK_W)) {
				playerY += playerVelocity;
			}
			if(StdDraw.isKeyPressed(KeyEvent.VK_S)) {
				playerY -= playerVelocity;
			}
			if(StdDraw.isKeyPressed(KeyEvent.VK_D)) {
				playerX += playerVelocity;
			}
			if(StdDraw.isKeyPressed(KeyEvent.VK_A)) {
				playerX -= playerVelocity;
			}

			long now = System.currentTimeMillis();
			if(now - currentTime > 1000) {
				score++;
				currentTime = now;
				newHighScore++;
			}
			if (newHighScore > highScore) {
				highScore = newHighScore;
			}

			//player borders
			if(playerX > 1) { 
				playerX = 1; 
			}
			if(playerX < 0) { 
				playerX = 0; 
			}
			if(playerY > 1) { 
				playerY = 1; 
			}
			if(playerY < 0) {
				playerY = 0; 
			}
			
			//collision detection:
			for(int i = 0; i < numberOfBalls; i++) {
				double distance = Math.sqrt(Math.pow(playerX-ballX[i], 2) + Math.pow(playerY-ballY[i], 2));
				if(distance < 0.05) {
					playerX = 0.5;
					playerY = 0.5;
					score = 0;
				}
			}
			
			//draw on canvas
			StdDraw.setPenColor(Color.RED);
			for(int i = 0; i < numberOfBalls; i++) {
				StdDraw.point(ballX[i], ballY[i]);
			}
			StdDraw.setPenColor(Color.BLUE);
			StdDraw.point(playerX, playerY);
			StdDraw.text(0.2,0.1, "Score: " + score);
			StdDraw.text(0.8,0.1, "Highscore: " + highScore);
			
			//pause to make the animation smooth
			StdDraw.show();
			StdDraw.pause(5);
			
		}
	}
}
