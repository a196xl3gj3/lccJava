package eight;

public class Work220907 {
   public static void main(String[] args) {
        Thread ra = new Thread(new Ra());// 依下面類別產生新的物件
        Thread tu = new Thread(new Tu());
		ra.setName("兔子");//定義名稱
		tu.setName("烏龜");
		
		System.out.println("龜兔賽跑遊戲開始!!!");  
		ra.start();//執行續啟動
		tu.start();
		try {
		// 讓與這個執行緒整個執行完畢後，其他的執行緒才會繼續往下
			ra.join(); 
			tu.join();
			System.out.println("比賽結束!");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
    }
}
//設定公開的類別，同個package都可使用
class Contest {
    public static final int l = 20; //比賽距離
    public static int rL = 18;  //兔子前進距離
    public static int tL = 19;  //烏龜前進距離
}
//兔子-延伸執行續
class Ra extends Thread {
    @Override
    public void run() {
        for (int i=2;i<=21;i=i+2) {
        	String name = Thread.currentThread().getName();
            try {
                if (Contest.rL<0) { //設定獲勝動物
					System.out.println(name+"獲勝！");
					break;
                }// 相減取剩餘步數
				System.out.println("我是"+name+"，我開始跳..跳..，還有"+(Contest.l-i)+"步");
				Thread.sleep(1000); // 兔子跳躍
				int r = 0; // 設定亂數，讓兔子睡覺
				r = (int)(Math.random()*100)+1;
				if (r%2==0 || r%3==0 || r%5==0|| r%7==0) {
					System.out.println("烏龜好慢，"+name+"睡一下。");
					Thread.sleep(2000);
				}// 兔子的腳步相減
				Contest.rL = Contest.rL-2;
            }catch (Exception e) {
                e.printStackTrace();
            }
        }System.out.println("兔子到達終點");
    }
}
//烏龜
class Tu extends Thread {
    @Override
    public void run() {
        for (int i=1;i<=21;i++) {
        	String name = Thread.currentThread().getName();
            try {
                if (Contest.tL<0) { //設定獲勝動物
	                System.out.println(name+"獲勝！");
	                break;
                }// 相減取剩餘步數
				Thread.sleep(1000); // 烏龜爬爬
				System.out.println("我是"+name+"，我開始慢慢爬...，還有"+(Contest.l-i)+"步");
				Contest.tL = Contest.tL-1; // 烏龜的腳步相減
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }System.out.println("烏龜到達終點");
    }
}

