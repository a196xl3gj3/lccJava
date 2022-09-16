package traffic;

// 建立交通工具介紹內容
public class Transportation {
	public static void main(String[] args) {
		Ziqiang Zi = new Ziqiang("自強號，開往台北，",566,"速度很快，班次較多");
		HighRail HR = new HighRail("高鐵，直達高雄",977,"速度優於自強號，但單價也貴很多。");
		Taroko Ta = new Taroko("太魯閣號，直衝花蓮",492,"中部去花蓮第一選擇，價格便宜速度快");
		System.out.println("鐵軌上行駛介紹:");
		Zi.drive();
		Zi.rail();
		Zi.ride();
		Zi.funct();
		
		HR.drive();
		HR.rail();
		HR.ride();
		HR.funct();
		
		Ta.drive();
		Ta.rail();
		Ta.ride();
		Ta.funct();
		System.out.println();
		System.out.println("道路上行駛介紹:");
		// 介紹多型(多種形態)
		Road Ro1 = new Bus("11號公車",35,"在市區街道上行駛");
		Ro1.road();
		Road Ro2 = new Taxi("黃色的計程車", 4, "打了55688，我5分鐘後就會出現在你面前");
		Ro2.road();
		
		System.out.println();
		System.out.println("海上行駛介紹");
		
		System.out.println();
		System.out.println("航空母艦行駛介紹:");
		Aerial Ae1 = new AircraftCarrier("航空母艦",10,"登入後就可以放出飛機攻擊");
		showAerial(Ae1);
		System.out.println("坦克登入艇行駛介紹:");
		TankCraft TC = new TankCraft();
		TC.DeepMar();
		TC.maritime();
		TC.road();
		TC.Chariot();
		TC.driver();
		
		System.out.println();
		System.out.println("空中行駛介紹:");
		Aerial Ae2 = new CivilAviation("華航民航機",180,"可以飛離台灣，去任何你想去的地方");
		showAerial(Ae2);
		Airplane Ai = new Airplane("戰鬥機", 2, "外觀有迷彩的顏色。");
		Ai.swim();
		Ai.aerial();
		Ai.helicopter();
		Ai.glider();

		System.out.println();
		System.out.println("部隊介紹:");
		Amphibious Am = new Amphibious("兩棲蛙人","士官長");
		Am.swim();
		Amphibious Am1 = new Amphibious("兩棲蛙人","中士");
		Am1.frogman();
		Amphibious Am2 = new Amphibious("兩棲蛙人","下士");
		Am2.deviltraining();
		
	}
	// 顯示海上行駛 showAerial的方法中，可以再海上行駛的進來，就會顯示該類別aerial的方法
	static void showAerial(Aerial aerial) {
		aerial.aerial();
	}
	
	
}
