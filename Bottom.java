package clothes;

public class Bottom extends Clothes{

	private int legsLength;
	private int waist;
	private int hips;
	private int length;
	
	
	public Bottom(int legsLength, int waist, int hips, int length) {
		super();
		this.legsLength = legsLength;
		this.waist = waist;
		this.hips = hips;
		this.length = length;
	}
	
	public Bottom() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Bottom(String name, int id, String material, String colour, String pattern, int size, int amount,
			Designer designer, int price) {
		super(name, id, material, colour, pattern, size, amount, designer, price);
		// TODO Auto-generated constructor stub
	}

	public int getLegsLength() {
		return legsLength;
	}

	public void setLegsLength(int legsLength) {
		this.legsLength = legsLength;
	}

	public int getWaist() {
		return waist;
	}

	public void setWaist(int waist) {
		this.waist = waist;
	}

	public int getHips() {
		return hips;
	}

	public void setHips(int hips) {
		this.hips = hips;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
