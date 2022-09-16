package traffic;
// 建立兩棲蛙人部隊
public class Amphibious extends Marines implements Swimming{

	public Amphibious(String name, String hierarchy) {
		super(name, hierarchy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.printf("%s的%s在海上用快艇訓練%n",name,hierarchy);
		
	}

}
