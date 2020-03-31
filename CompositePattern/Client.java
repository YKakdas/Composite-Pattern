public class Client {
	public static void main(String[] args){
		Weapon weapon1 = new Weapon("Weapon","Shotgun",0);
		Weapon weapon2 = new Weapon("Weapon","Rifle",1);

		Composite weaponComposite = new Composite();
		weaponComposite.addGameUnit(weapon1);
		weaponComposite.addGameUnit(weapon2);

		Clothes clothes1 = new Clothes("Clothes","Boot",2);
		Clothes clothes2 = new Clothes("Clothes","hat",3);

		Composite clothesComposite = new Composite();
		clothesComposite.addGameUnit(clothes1);
		clothesComposite.addGameUnit(clothes2);

		Composite mainComposite = new Composite();
		mainComposite.addGameUnit(weaponComposite);
		mainComposite.addGameUnit(clothesComposite);

		mainComposite.gameUnitInfo();
	}
}
