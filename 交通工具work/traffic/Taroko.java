package traffic;
// 太魯閣號
public class Taroko extends Train{

	public Taroko(String name, int numbers, String special) {
		super(name, numbers, special);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void rail() {
		// TODO Auto-generated method stub
		System.out.printf("%s 行駛方向直達花蓮%n", name);
	}

	// 顯示載客人數
	public void ride() {
		System.out.printf("可以載%d人數%n",numbers);
	}
	// 太魯閣的特色
	public void funct() {
		System.out.printf("特色是:%s%n",special);
	}

}
