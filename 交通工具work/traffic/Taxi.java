package traffic;
// 建立計程車
public class Taxi extends FourWheels{
	public Taxi(String name, int numbers, String special) {
		super(name, numbers, special);
	}
	

	@Override //把方法都寫在一起
	public void road()  {
		System.out.printf("%s市區行駛，時速30km，塞車中%n可以載%d人數%n特色是:%s",name,numbers,special);
		System.out.println();
	}	
}
