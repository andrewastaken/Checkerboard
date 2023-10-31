package application;

import javafx.scene.input.MouseEvent;

public class Controller 
{
	public void mousePressed(MouseEvent event)
	{
		System.out.println("mouse pressed");
	}
	
	public void mouseDragged(MouseEvent event)
	{
		System.out.println("mouse dragged");
	}
	
	public void mouseReleased(MouseEvent event)
	{
		System.out.println("mouse released");
	}
}
