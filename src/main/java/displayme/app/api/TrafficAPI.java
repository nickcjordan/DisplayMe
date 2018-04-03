package displayme.app.api;


import com.fasterxml.jackson.core.type.TypeReference;

import displayme.app.traffic.TrafficAPIResponse;
import displayme.model.Modules;

public class TrafficAPI extends APIConnection {
	
	private static final String apiKey = "YalmMlDd8ol6TKZ7rNKaFzgGXVQDfqZK";
	private static final String url = "http://www.mapquestapi.com/directions/v2/optimizedroute?key=";
	private static final String json = "{\"locations\":[{\"street\":\"4601%20Amesbury%20Dr\",\"city\":\"Dallas\",\"state\":\"TX\",\"postalCode\":\"75206\"},{\"street\":\"1415%20State%20St\",\"city\":\"Richardson\",\"state\":\"TX\",\"postalCode\":\"75082\"}]}";
	
	private TrafficAPIResponse traffic;
	
	public TrafficAPI() { super();
		traffic = getTrafficData();
	}

	private TrafficAPIResponse getTrafficData() {
		TypeReference<TrafficAPIResponse> type = new TypeReference<TrafficAPIResponse>() {};
		return (Modules.TRAFFIC.isactive()) ? (TrafficAPIResponse) mapResponse(GET(url + apiKey + "&json=" + json), type) : null;
	}

	public TrafficAPIResponse getTraffic() {
		return traffic;
	}
	
}


