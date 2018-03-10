package displayme.app.news;

import java.util.HashMap;

public enum NewsSource {
	
	GOOGLE_NEWS("google-news", "Google News"),
	TECHCRUNCH("techcrunch", "TechCrunch"),
	ESPN("espn", "ESPN"),
	USA_TODAY("usa-today", "USA Today");
	
	private String name;
	private String displayName;
	private static HashMap<String, String> map;
	
	static {
		map = buildMap();
	}

	NewsSource(String name, String displayName) {
		this.name = name;
		this.displayName = displayName;
	}
	
	public static HashMap<String, String> getMap() {
		return map;
	}

	private static HashMap<String, String> buildMap() {
		HashMap<String, String> map = new HashMap<String, String>();
		for (NewsSource source : NewsSource.values()) {
			map.put(source.getName(), source.getDisplayName());
		}
		return map;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

}
