public class Clothes implements GameUnit {
	private String type;
	private String name;
	private int id;

	public Clothes(String type,String name,int id){
		this.type = type;
		this.name = name;
		this.id = id;
	}
	@Override
	public void gameUnitInfo() {
		System.out.println("I am " + name + " of type " + type  + " with " + id + " id number");
	}
}
