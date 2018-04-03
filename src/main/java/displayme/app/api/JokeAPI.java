package displayme.app.api;

import com.fasterxml.jackson.core.type.TypeReference;

import displayme.app.joke.JokeAPIResponse;
import displayme.model.Modules;

public class JokeAPI extends APIConnection {

	private static final String url = "http://www.icanhazdadjoke.com/slack";
	
	private JokeAPIResponse jokeResponse;
	
	public JokeAPI() { super();
		jokeResponse = getJokeData();
	}
	
	private JokeAPIResponse getJokeData() {
		TypeReference<JokeAPIResponse> type = new TypeReference<JokeAPIResponse>() {};
		return (Modules.JOKE.isactive()) ? (JokeAPIResponse) mapResponse(GET(url ), type) : new JokeAPIResponse();
	}
	
	public String getJoke() {
		return jokeResponse.getAttachments().get(0).getText();
	}
	
}
	
