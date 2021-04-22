package clothes;

import java.util.ArrayList;
import java.util.List;

public class Designer extends Person {
		private int money;
		private List<Clothes> designs = new ArrayList<Clothes>();

		public Designer(String name, String lastName, int money) {
			super(name, lastName);
			this.money = money;
		}

		@Override
		public String toString() {
			return "Designer " + this.getName() + " " + this.getLastName() ;
		}

		public String designerTalking() {
			return this.toString() + ":";
		}
		
		@Override
		public boolean putOnClothes(Clothes clothes) {
			boolean fit = false;
			if (clothes.getDesigner() == this) {
				System.out.println(this.designerTalking() + " - Sorry, I do not put on clothes designed by me...");
			}
			else System.out.println(this.designerTalking() + " - Oh, my colleague made great " + clothes.toStringShort());
			return fit;
		}

		public void createClothes (Clothes clothes) {
			clothes.setDesigner(this);
			System.out.println(this.designerTalking() + " - Oh, I`m a genious and created a brand-new piece of clothing, look what a brilliant idea: \n" + clothes.toString());
			this.designs.add(clothes);
		}
		
		public void showDesignes () {
			if (designs != null) {
				System.out.println(this.designerTalking() + " - Wow, you wanted to see my designes? \nHere is the list: " + designs.toString());
			}
			else System.out.println(this.designerTalking() + " - I haven`t created any recent designs...");
		}

	}

