package traffic;

public abstract class FourWheels implements Road{
	/*
	 * class前面加上 abstract 表示此類別自己無法生成
	 * java中只能繼承一個類別，但可以宣告多個介面(用，隔開)
	 */
	protected String name;
	protected String special;
	protected int numbers;
	public FourWheels(String name,int numbers,String special) {
		this.name = name;
		this.numbers = numbers;
		this.special = special;
	}

	public void drive() {
		System.out.printf("%s 在鐵軌上行駛%n",name);
	}
}
