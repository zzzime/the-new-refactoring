package oop;

//工厂模式获取Monster
public class MonsterFactory {
	
	public static Monster getMonster(int choice) {
		
		if(choice == 1) {
			return  new Ogre();
		}else if(choice == 2) {
			return new Gremlin();
		}else {
			if(choice != 3) {
				System.out.println("invalid choice, returning Skeleton");
			}
			return new Skeleton();
		}
	}

}
