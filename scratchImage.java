

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;


public class scratchImage {
	
	static int width = 1200;
	static int height = 700;

	public static void main(String[] args) {
		Draw.window(width, height);
		Draw.setTitle("Scratch Image");
		
		runGame();
		
	}
	
	
	
	static void runGame()
	{
	
		RectangleCover r = new RectangleCover();
		int time = 0;
		r.draw();
		Draw.pauseUntilMouse();
		RandomImage.draw();
		while(time < 1000)
		{
			
			//if click -> skip a certain rectangle drawing

			RandomImage.draw();
			r.draw();
			Draw.pause(0.1);
			time += 1;
			if (Draw.clicked)
			{
				r.clicked(Draw.getMouseX(), Draw.getMouseY());
		//		Draw.rectangle(Draw.getMouseX(), Draw.getMouseY(), 50, 50);
//				Draw.setFill(false);
				
			}
		}
			
		
		
	
	}
	
	
		
	}
