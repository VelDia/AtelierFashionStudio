package clothes;

public class Top extends Clothes {

	private int lengthOfSleeves;
	private int widthOfShoulders;
	private int waist;
	private int heightOfBack;
	
	public Top(int lengthOfSleeves, int widthOfShoulders, int waist, int heightOfBack) {
		super();
		this.lengthOfSleeves = lengthOfSleeves;
		this.widthOfShoulders = widthOfShoulders;
		this.waist = waist;
		this.heightOfBack = heightOfBack;
	}

	public Top() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Top(String name, int id, String material, String colour, String pattern, int size, int amount,
			Designer designer, int price) {
		super(name, id, material, colour, pattern, size, amount, designer, price);
		// TODO Auto-generated constructor stub
	}

	public int getLengthOfSleeves() {
		return lengthOfSleeves;
	}

	public void setLengthOfSleeves(int lengthOfSleeves) {
		this.lengthOfSleeves = lengthOfSleeves;
	}

	public int getWidthOfShoulders() {
		return widthOfShoulders;
	}

	public void setWidthOfShoulders(int widthOfShoulders) {
		this.widthOfShoulders = widthOfShoulders;
	}

	public int getWaist() {
		return waist;
	}

	public void setWaist(int waist) {
		this.waist = waist;
	}

	public int getHeightOfBack() {
		return heightOfBack;
	}

	public void setHeightOfBack(int heightOfBack) {
		this.heightOfBack = heightOfBack;
	}
	
}
