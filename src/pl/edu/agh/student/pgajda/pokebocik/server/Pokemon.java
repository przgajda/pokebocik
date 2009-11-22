package pl.edu.agh.student.pgajda.pokebocik.server;

import java.util.Random;

import com.google.wave.api.TextView;

public class Pokemon {
	public static void pokemonize(TextView text)
	{
		String in = text.getText();
		StringBuilder out = new StringBuilder();
		
		for(int i=0; i<in.length(); i++)
			if( i%2 == 0 )
				out.append((""+in.charAt(i)).toLowerCase());
			else
				out.append((""+in.charAt(i)).toUpperCase());
		
		text.replace(out.toString());
		text.setAnnotation("style/color", getColor());
	}
	
	public static String getColor()
	{
		int r, g, b;
		
		Random rand = new Random(System.currentTimeMillis());
		do {
			r = rand.nextInt(256);
			g = rand.nextInt(256);
			b = rand.nextInt(256);
		} while (r+g+b > 600);
		
		return String.format("rgb(%d,%d,%d)", r, g, b); 
	}
}
