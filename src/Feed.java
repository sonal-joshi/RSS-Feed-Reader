

// feed message structure 
public class Feed {

	String title;
	String description;
	private String link;
	private String author;
	private String guid;


	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setDescription(String title) {
		this.title=title;
	}
	
	public String getDescription() {
		return title;
	}
	
	 public String getLink() {
	        return link;
	    }

	    public void setLink(String link) {
	        this.link = link;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public String getGuid() {
	        return guid;
	    }

	    public void setGuid(String guid) {
	        this.guid = guid;
	    }
	
}
