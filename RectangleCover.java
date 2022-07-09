

import java.awt.Rectangle;

public class RectangleCover
{

	static int width = 100;
	static int height = 100;
	int [][] rect;
	
	public RectangleCover()
	{
		rect = new int[1200/width][700/height];
		Draw.setColor(0, 0, 0);
		Draw.setFill(true);
		
	}
	
	
	public void draw()
	{
		for(int y = 0; y < 700; y+=width)
		{
	
			
			for(int x = 0; x < 1200; x+=height)
				{
					if(rect[x/width][y/height] == 0)
						Draw.rectangle(x, y, width, height);
					
				}
		}

	}		
	public void clicked(int x, int y)
	{
		rect[x/width][y/height] = 1;
	}
	
	
	
	
	
	
	
}
