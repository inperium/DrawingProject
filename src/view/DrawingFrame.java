package view;

import java.awt.Dimension;

import javax.swing.JFrame;

import controller.DrawingController;

public class DrawingFrame extends JFrame {
	private DrawingPanel basePanel;
	private DrawingController baseController;

	public DrawingFrame(DrawingController baseController) {
		super();
		this.baseController = baseController;
		basePanel = new DrawingPanel(baseController);

		setupFrame();
	}

	private void setupFrame() {
		this.setContentPane(basePanel);
		this.setTitle("draw graph");
		this.setSize(new Dimension(1000, 1000));
		this.setResizable(false);
		this.setVisible(true);

	}
}
