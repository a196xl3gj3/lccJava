package traffic;
// 高鐵
public class HighRail extends Train{

	public HighRail(String name, int numbers, String special) {
		super(name, numbers, special);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rail() {
		// TODO Auto-generated method stub
		System.out.printf("%s 以時速350km 飆速行駛中%n",name);
	}

	// 顯示載客人數
	public void ride() {
		System.out.printf("可以載%d人數%n",numbers);
	}
	// 高鐵的特色
	public void funct() {
		System.out.printf("特色是:%s%n",special);
		System.out.println();
	}

}
