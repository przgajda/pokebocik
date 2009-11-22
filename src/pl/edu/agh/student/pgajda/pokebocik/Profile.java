package pl.edu.agh.student.pgajda.pokebocik;

import com.google.wave.api.ProfileServlet;

@SuppressWarnings("serial")
public class Profile extends ProfileServlet {
	@Override
	public String getRobotName() {
		return "PokeBocik";
	}
 
	@Override
	public String getRobotAvatarUrl() {
		return "http://waveblog.pl/pokebocik.png";
	}
  
  	@Override
  	public String getRobotProfilePageUrl() {
  		return "http://waveblog.pl";
  	}
}