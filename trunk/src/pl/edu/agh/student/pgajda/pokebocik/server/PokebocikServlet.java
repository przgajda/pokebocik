package pl.edu.agh.student.pgajda.pokebocik.server;

import com.google.wave.api.*;

@SuppressWarnings("serial")
public class PokebocikServlet extends AbstractRobotServlet {

	@Override
	public void processEvents(RobotMessageBundle bundle) {
		Wavelet wavelet = bundle.getWavelet();
		
		if (bundle.wasSelfAdded()) {
			Blip blip = wavelet.appendBlip();
			TextView textView = blip.getDocument();
			textView.append("PokeBocik wita wszystkich!");
		}

		for (Event e: bundle.getEvents()) {
			if (e.getType() == EventType.BLIP_SUBMITTED) {
				Pokemon.pokemonize(e.getBlip().getDocument());
			}
		}
	}
}
