import java.util.ArrayList;


public class MainReader {
	
	public static void main(String[] args) {
	String url="http://rss.nytimes.com/services/xml/rss/nyt/US.xml";
	FeedReader parser=new FeedReader(url);
		

	ArrayListFeed array=parser.readFeed();
	 //System.out.println(array);
	for (Feed message : array.getMessages()) {
        System.out.println(message.getTitle());
        
    } 
	
	
	}	
	
}
