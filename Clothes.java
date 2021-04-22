package clothes;

public abstract class Clothes {

	private String name;
	private int id;	
	private String material;	
	private String colour;
	private String pattern;	
	private int size;	
	private int amount;
	private Designer designer;
	private int price;
	
	
	public Clothes() {}

	public Clothes(String name, int id, String material, String colour, String pattern, int size, int amount, Designer designer, int price) {
		this.name = name;
		this.id = id;
		this.material = material;
		this.colour = colour;
		this.pattern = pattern;
		this.size = size;
		this.amount = amount;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Clothes [name= " + name + ", id= " + id + ", material= " + material + ", colour= " + colour + ", pattern= "
				+ pattern + ", size= " + size + ", amount= " + amount + ", designer= " + designer + ", price= " + price
				+ "]";
	}
	
	public void buyClothes(Client client) {
		if (this.amount > 0) {
			if (client.putOnClothes(this) == true) {
				System.out.println(client.clientTalking() + " - I like it, so I want to buy " + this.getName() + ", how much does it cost? \n"
						+ this.getDesigner().designerTalking() + " - It sells for " + this.getPrice());
				if (client.getCash() >= this.getPrice()) {
					client.setCash(client.getCash() - this.getPrice());
					System.out.println(client.clientTalking() + " - Oh, great! I will buy it. *Message from bank: " + client.getCash() + " left*");
					this.setAmount(this.getAmount() - 1);
					System.out.println(this.getDesigner().designerTalking() + " - Superb!" + this.getName() + 
							" will serve you well! *Message from bank: +" + this.getPrice() + "received* Have a nice day!");
				}
				else System.out.println(client.clientTalking() + " - Sorry, I won`t buy it.");
			}
			else System.out.println(client.clientTalking() + " - Sorry, it doesn`t fit me. I won`t buy it!");	
		}
		
	}
	
	public String toStringShort() {
		return "Clothes " + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Designer getDesigner() {
		return designer;
	}

	public void setDesigner(Designer designer) {
		this.designer = designer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
