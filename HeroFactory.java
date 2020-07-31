package oop;

//工厂模式获取hero
public class HeroFactory {
	
	public static Hero getHero(int choice) {
		
		if(choice == 1) {
			return new Warrior();
		}else if(choice == 2) {
			return new Sorceress();
		}else {
			if(choice != 3) {
				System.out.println("invalid choice, returning Thief");
			}
			return new Thief();
		}
	}

}
