package traffic;
// 建立海軍陸戰隊
public class Marines {
	// 套入名稱和階級
	protected String name,hierarchy;
	
	public Marines(String name, String hierarchy) {
		this.name = name; // 建構初始化
		this.hierarchy = hierarchy; // 階級
	}
	// 蛙人操
	public void frogman(){
		System.out.printf("%s的%s在跳蛙人操%n",name,hierarchy);
	}
	// 魔鬼訓練
	public void deviltraining() {
		System.out.printf("%s的%s對%s實施魔鬼式訓練%n",name,hierarchy,hierarchy);
	}
}
