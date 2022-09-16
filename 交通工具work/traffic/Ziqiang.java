package traffic;
// 自強號繼承火車
public class Ziqiang extends Train{

	public Ziqiang(String name,int numbers,String special) {
		super(name,numbers,special);
		// TODO Auto-generated constructor stub ,numbers,special
	}
	
	@Override 
	public void rail()  {
		System.out.printf("%s時速130km，奔跑中%n",name);
	}
	// 顯示載客人數
	public void ride() {
		System.out.printf("可以載%d人數%n",numbers);
	}
	// 自強號的特色
	public void funct() {
		System.out.printf("特色是:%s%n",special);
		System.out.println();
	}

}
