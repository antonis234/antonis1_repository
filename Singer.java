// Εκτός από τα this, διόρθωσα κάποια λάθη που είχα στην άσκηση την προηγούμενη εβδομάδα. Συγκεκριμένα διόρθωσα την κλάση SongTest

public class Singer{

	private String name;
	private int id;

	static int counter=0;

	public Singer(String name1,int id){
		name= name1;
		this.id= id;
		this.id = ++counter;
	}

	public String getName(){
		return name;
	}

	public void setName(String name1){
	   name=name1;
	}

	public int getId(){
		return id;
	}

	public void setId(int id1){
		this.id=id;
	}

	public String toString(){
		return "Singer[name=" +name +", id="+ id +"]";
	}

		}
