package clothes;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Designer d1 = new Designer("Andre", "Tan", 0);
		System.out.println("Hi, I`m " + d1.toString());
		Shirt sh1 = new Shirt("Awesome shirt", 1, "silk", "beige", "with tiny flowers", 12, 3, d1, 1000);
		d1.createClothes(sh1);
		d1.putOnClothes(sh1);
		Client c1 = new Client("Andy", "Last", 170, 60, 30, 60, 60, 100, 90, 2500, 13);
		sh1.buyClothes(c1);
		Shorts sh2 = new Shorts("Best shorts", 1, "jeans", "light blue", "none", 13, 3, d1, 1000);
		d1.createClothes(sh2);
		sh2.buyClothes(c1);
		d1.showDesignes();
		
	}

}
