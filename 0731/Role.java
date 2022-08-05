package three;

public class Role {
	
	private String name;
	private int hp,level,mp;
	
	public Role(String name,int hp,int mp, int level) {
		
		this.name = name;
		this.hp = hp;
		this.level = 1;
		this.mp = mp;
	}
	public Role(String name, int hp,int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public void fight() {
		System.out.println("角色攻擊");
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public int getMp() {
		return this.mp;
	}
//	因為建構式已經私有化，所以方法都要自己建立
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
}
