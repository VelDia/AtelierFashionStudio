package clothes;

public class Shorts extends Bottom{
	
	public Shorts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shorts(int legsLength, int waist, int hips, int length) {
		super(legsLength, waist, hips, length);
		// TODO Auto-generated constructor stub
	}

	public Shorts(String name, int id, String material, String colour, String pattern, int size, int amount,
			Designer designer, int price) {
		super(name, id, material, colour, pattern, size, amount, designer, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toStringShort() {
		return "Shorts " + this.getName();
	}

	@Override
	public String toString() {
		return "Shorts [name= " + getName() + ", id= " + getId() + ", material= " + getMaterial() 
		+ ", colour= " + getColour() + ", pattern= " + getPattern() + ", size= " + getSize() +
		", amount= " + getAmount() + ", designer= " + getDesigner() + ", price= " + getPrice() + "]";
	}

}
