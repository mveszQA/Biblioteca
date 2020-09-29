package biblioteca;

public class Magazine extends LibroSource{

	Magazine(String name, int resID){
		this.resourceName = name;
		this.resourceID = resID;
		this.type = Constants.MAGAZINE;
	}
	
}
