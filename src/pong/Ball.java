package pong;

import java.awt.Color;

public class Ball extends Sprite {

	private static final int BALL_WIDTH = 15;
	private static final int BALL_HEIGHT = 15;
	private static final Color BALL_COLOR = Color.BLACK;
	
	public Ball (int panelWidth, int panelHeight) {
		setWidth(BALL_WIDTH);
		setHeight(BALL_HEIGHT);
		setColor(BALL_COLOR);
		setInitialPosition( panelWidth / 2 - (getWidth() / 2), panelHeight / 2 - (getHeight() / 2 ));
		resetToInitialPosition();
	}
}
