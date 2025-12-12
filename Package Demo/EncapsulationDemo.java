
class EncapsulationDemo{

	private int id;
	private String name;
	private String city;
    public String getId;
    public String getName;

	//public getters and setters method allow us to read and write to secure way
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setCity(String city){
		this.city=city;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getCity(){
		return city;
	}
}