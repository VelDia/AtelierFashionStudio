package clothes;

public class Client extends Person{

	private int height;
	private int lengthOfSleeves;
	private int widthOfShoulders;
	private int waist;
	private int heightOfBack;
	private int legsLength;
	private int hips;
	
	private int cash;
	private int defaultSize;
	
	
	public Client() {}


	public Client(String name, String lastName, int height, int lengthOfSleeves, int widthOfShoulders, int waist,
			int heightOfBack, int legsLength, int hips, int cash, int defaultSize) {
		super(name, lastName);
		this.height = height;
		this.lengthOfSleeves = lengthOfSleeves;
		this.widthOfShoulders = widthOfShoulders;
		this.waist = waist;
		this.heightOfBack = heightOfBack;
		this.legsLength = legsLength;
		this.hips = hips;
		this.cash = cash;
		this.defaultSize = defaultSize;
	}
	
	@Override
	public boolean putOnClothes (Clothes clothes) {
		boolean clothesFit = false;
		if (this.defaultSize == clothes.getSize()) {
			System.out.println(this.clientTalking() + " - Wow, this " + clothes.toString() + " fits me so well, I like it!");
			clothesFit = true;
		}
		else System.out.println(this.clientTalking() + " - " + clothes.toStringShort() + " does not fit me, offer something else...");
		return clothesFit;
	}


	@Override
	public String toString() {
		return "Client " + getName() + " " + getLastName();
	}

	public String clientTalking() {
		return this.toString() + ":";
	}
	
	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
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


	public int getLegsLength() {
		return legsLength;
	}


	public void setLegsLength(int legsLength) {
		this.legsLength = legsLength;
	}


	public int getHips() {
		return hips;
	}


	public void setHips(int hips) {
		this.hips = hips;
	}


	public int getCash() {
		return cash;
	}


	public void setCash(int cash) {
		this.cash = cash;
	}


	public int getDefaultSize() {
		return defaultSize;
	}


	public void setDefaultSize(int defaultSize) {
		this.defaultSize = defaultSize;
	}
	

}
