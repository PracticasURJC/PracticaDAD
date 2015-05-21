package practica2.postealo.model;

public class Reply {
	
	private String company;
	private boolean viruses;
	private int analysis_time;
	
	public boolean isClean(){
		return viruses;
	}

}
