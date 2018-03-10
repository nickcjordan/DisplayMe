package displayme.app.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

import displayme.app.news.NewsAPIResponse;
import displayme.app.news.NewsSource;

//https://newsapi.org/v1/articles?source=techcrunch&apiKey=da440df49dda4005825250a8839a8079 
//https://newsapi.org/v1/articles?source=the-next-web&sortBy=latest&apiKey=1952a9b270674a1b9837f9a995b16246 
public class NewsAPI extends APIConnection {

	private static final String apiKey = "&apiKey=1952a9b270674a1b9837f9a995b16246";
	private static final String url = "https://newsapi.org/v1/articles?source=";
	private static List<String> sourceNames;
	private List<NewsAPIResponse> sources;
	
	public NewsAPI() { super();
//		sources = Arrays.asList("google-news", "techcrunch", "espn", "usa-today");
		sourceNames = Arrays.asList(NewsSource.GOOGLE_NEWS.getName(), NewsSource.TECHCRUNCH.getName(), NewsSource.ESPN.getName(), NewsSource.USA_TODAY.getName());
		sources = getAllSources();
	}
	
	public List<NewsAPIResponse> getNews() {
		return this.sources;
	}
	
	public List<NewsAPIResponse> getAllSources() {
		List<NewsAPIResponse> newsSources = new ArrayList<NewsAPIResponse>();
		for (String id : sourceNames) {
			NewsAPIResponse source = getNewsApiResponse(id);
			source.setDisplayName(NewsSource.getMap().get(id));
			newsSources.add(source);
		}
		return newsSources;
	}

	private NewsAPIResponse getNewsApiResponse(String id) {
		TypeReference<NewsAPIResponse> type = new TypeReference<NewsAPIResponse>() {};
		return (Modules.NEWS.isactive()) ? (NewsAPIResponse) mapResponse(GET(url  + id + apiKey ), type) : null;
	}
	
}


/* 
 * 
 * TODO: 
 * 		allow ability to show top, recent, etc
 * 
 */