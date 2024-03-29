package traffic;
// 建立飛機，有海跟飛的技能
// 類別實作介面，裡面的方法都要被實作出來
public class Airplane implements SearFlyer{
	protected String name;
	protected String special;
	protected int numbers;
	public Airplane(String name, int numbers, String special) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.numbers = numbers;
		this.special = special; 
	}

	@Override // 水中
	public void swim() {
		// TODO Auto-generated method stub
		System.out.printf("%s向下飛行，在水面中濺出水花%n裡面只能坐%d人%n特色是:%s%n",name,numbers,special);
	}

	@Override // 空中
	public void aerial() {
		// TODO Auto-generated method stub
		System.out.printf("%s在空中翱翔，可在空中直接攻擊敵人%n",name);
	}

	@Override // 直升機
	public void helicopter() {
		// TODO Auto-generated method stub
		System.out.println("我是直升機，我直直的來，直直的下");
	}

	@Override // 滑翔機
	public void glider() {
		// TODO Auto-generated method stub
		System.out.println("我是滑翔機，我有具有大展弦比的狹長機翼和光滑細長的機身");
	}

}
