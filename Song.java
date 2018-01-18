// Εκτός από τα this, διόρθωσα κάποια λάθη που είχα στην άσκηση την προηγούμενη εβδομάδα. Συγκεκριμένα διόρθωσα την κλάση SongTest

public class Song{

	private String title;
	private Singer singer;
	private String url;
	static int counter=0;
	private int id;

  public Song(String title, Singer singer,String url){
        this.title= title;
		this.singer= singer;
		this.url= url;
		this.id = ++counter;
	}

	public String getΤitle(){
		return title;
	}

	public void setΤitle(String title){
	   this.title= title;
	}

	public Singer getSinger(){
		return singer;
	}

	public void setSinger(Singer singer){
		this.singer= singer;
	}

	public String getUrl(){
			return url;
	}

	public void setUrl(String url){
		   this.url= url;
	}

		public String toString(){
			return "Singer[ title=" +title +",singer="+ singer +",url=" +url +"]";
		}

}
