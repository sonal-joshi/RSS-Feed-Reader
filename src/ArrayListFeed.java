import java.util.ArrayList;
import java.util.List;

public class ArrayListFeed {
// feed class
	final String title;
    final String link;
    final String description;
    final String language;
    final String copyright;
    final String pubDate;

    final List<Feed> entries = new ArrayList<Feed>();

    public ArrayListFeed(String title, String link, String description, String language,
            String copyright, String pubDate) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.language = language;
        this.copyright = copyright;
        this.pubDate = pubDate;   
    }

    public List<Feed> getMessages() {
        return entries;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }
    
    public String getLanguage() {
        return language;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getPubDate() {
        return pubDate;
    }
}
