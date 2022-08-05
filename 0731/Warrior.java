package three;
// 建立角色職業
public class Warrior extends Role{
	
	public Warrior(String name, int hp, int mp) {
		super(name, hp, mp);
	}
	
	public void fight() {
		System.out.println("三十六煩惱鳳");
	}
	
	public void deathblow() {
		System.out.println("衝衝鬼千刀");
	}
	
	public void attack() {
		System.out.println("普通攻擊");
	}
	
	public void HP25(){
		System.out.println("娜美少了25%血");
	}
	
	public void HP50(){
		System.out.println("娜美少了50%血");
	}
	public void HP75(){
		System.out.println("娜美少了75%血");
	}
	
}
