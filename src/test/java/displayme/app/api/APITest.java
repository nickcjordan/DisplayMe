package displayme.app.api;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import displayme.app.news.Article;
import displayme.app.news.NewsAPIResponse;

public class APITest {

	@Test
	public void newsAPITest() {
		List<NewsAPIResponse> news = new NewsAPI().getAllSources();
		for (NewsAPIResponse source : news) {
			System.out.println(source.getSource());
			for (Article article : source.getArticles()) {
				System.out.println("\t" + article);
			}
		}
	}

}
