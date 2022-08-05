package three;

public class WorkPK220731_1 {
	public static void main(String[] args) {

		// 輸入兩個1-100的亂數
		int  t= 48;
//		t = (int) (Math.random() * 100) + 1;
		System.out.println("幸運數字為:" + t);
		int z = 5;
//		z = (int) (Math.random() * 5) + 1;
		
		round1(t);
		round2(t);
		
		if (t%12 == 0){
			Special(t,z);
		}else if (t%6 == 0){
			round3(t);
		}else {
			round3(t);
		}
	}
	// 第一回合
	static void round1(int t) {
		// 建立武士、舞者
		Warrior wa = new Warrior("索隆",1000,500);
		Dancer da = new Dancer("娜美",800,650);
		
		if ((t%2) == 0) {
			System.out.print(wa.getName()+"使出了:");
			wa.fight();
			wa.HP50();
			System.out.println(da.getName()+"血量剩下:"+(da.getHp() - 400));
			System.out.println();
		}else {
			System.out.print(da.getName()+"使出了:");
			da.fight();
			da.HP50();
			int waHP1 = (wa.getHp() - 500);
			System.out.println(wa.getName()+"血量剩下:"+waHP1);
			System.out.println();
		}
	}
	// 第二回合
	static void round2 (int t) {
		// 建立武士、舞者
		Warrior wa = new Warrior("索隆",1000,500);
		Dancer da = new Dancer("娜美",800,650);
		
		if ((t%6) == 0) {
			System.out.print(wa.getName()+"趁勝追擊，使出了:");
			wa.attack();
			wa.HP25();
			System.out.println(da.getName()+"血量剩下:"+((da.getHp() - 400) - 200));
			System.out.println();
		}
		else {
			System.out.print(wa.getName()+"使出了:");
			wa.fight();
			wa.HP50();
			int daHP1 = (da.getHp() - 400);
			System.out.println(da.getName()+"血量剩下:"+daHP1);
			System.out.println();
		}

	}
	// 第三回合
	static void round3(int t) {
		// 建立武士、舞者
		Warrior wa = new Warrior("索隆",1000,500);
		Dancer da = new Dancer("娜美",800,650);
		if (t%6 == 0) {
			System.out.print(da.getName()+"紅血，使出了必殺技:");
			da.fight();
			da.HP50();
			System.out.println(wa.getName()+"血量剩下:"+(wa.getHp() - 500));
			System.out.println();
			
			System.out.print(wa.getName()+"再出殺招，使出了:");
			wa.fight();
			System.out.println(da.getName()+"血量剩下:"+((da.getHp() - 600) - 200)+"，"+da.getName()+"輸了!");
			System.out.println();
		}else {
			System.out.println("娜美不小心採到香蕉皮，倒入索隆懷裡!不打了，遊戲結束。");
		}
		
	}
	// 特殊狀況
	static void Special(int t,int z) {
		// 建立武士、舞者
		Warrior wa = new Warrior("索隆",1000,500);
		Dancer da = new Dancer("娜美",800,650);
		System.out.println("幸運數字為:" + z);
		
		System.out.print(da.getName()+"紅血，使出了必殺技:");
		da.fight();
		da.HP50();
		System.out.println(wa.getName()+"血量剩下:"+(wa.getHp() - 500));
		System.out.println();
		
		if(z == 5) {
			System.out.print(da.getName()+"紅血，再反擊:");
			da.fight();
			System.out.println(da.getName()+"逆轉勝，"+wa.getName()+"輸了!!");
			System.out.println();
		}
		else {
			System.out.println("逆轉失敗");
			System.out.print(wa.getName()+"使出了:");
			wa.attack();
			System.out.println(da.getName()+"血量剩下:"+((da.getHp() - 600)-200)+"，"+da.getName()+"輸了!");
		}
					
	}
	
}
