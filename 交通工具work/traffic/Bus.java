package traffic;
// 巴士在路上行駛
public class Bus extends FourWheels{
	// 此類別自己無法生成
//	protected String name;
	public Bus (String name,int numbers,String special) {
		super(name,numbers,special);
	}
	@Override //把方法都寫在一起
	public void road()  {
		System.out.printf("%s時速60km，行駛中，只是中途要一直停下載人%n可以載%d人數%n特色是:%s",name,numbers,special);
		System.out.println();
	}

}
