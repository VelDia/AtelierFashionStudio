package clothes;

public class Shirt extends Top{
	
	public Shirt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shirt(int lengthOfSleeves, int widthOfShoulders, int waist, int heightOfBack) {
		super(lengthOfSleeves, widthOfShoulders, waist, heightOfBack);
		// TODO Auto-generated constructor stub
	}

	public Shirt(String name, int id, String material, String colour, String pattern, int size, int amount,
			Designer designer, int price) {
		super(name, id, material, colour, pattern, size, amount, designer, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Shirt " + getName() + " " + "Material=" + getMaterial() + ", Colour=" + getColour() + ", Pattern=" + getPattern()
				+ ", Size=" + getSize() + ", Designer=" + getDesigner() + ", Price=" + getPrice();
	}
	
	@Override
	public String toStringShort() {
		return getMaterial() + " " + getName();
	}
	
}
