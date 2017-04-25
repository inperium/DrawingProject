package controller;

import view.DrawingFrame;

public class DrawingController {
	private DrawingFrame baseFrame;

	public void start() {
		baseFrame = new DrawingFrame(this);
	}

}
