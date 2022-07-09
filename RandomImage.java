
public class RandomImage {

		static int width = 1200;
		static int height = 700,
	
	
	type = (int)(Math.random()*3);
	String[] images = {"20170722_STP001_0.jpg", "im57795538.jpg", "https__blogs-images.forbes.com_files_2017_11_Ashville-1200x797.jpg"};
	String img = images[type];
	
	public static void draw()
	{
		if(type == 0) //image 1
		{
		Draw.image(0, 0, width, height, "20170722_STP001_0.jpg");
	}
	else if(type == 1) //image 2
	{
		Draw.image(0, 0, width, height, "im57795538.jpg");
	}
	else if(type == 2)//image 3
	{
		Draw.image(0, 0, width, height, "cascade-clouds-cool-wallpaper-210186.jpg");
	}
}
}
