package traffic;
// 民航機
public class CivilAviation extends Airplane{
	public CivilAviation(String name, int numbers, String special) {
		super(name, numbers, special);
	}
	@Override //把方法都寫在一起
	public void aerial()  {
		System.out.printf("%s在空中和海中行駛，時速950km，在空中暢行無阻%n可以載%d人數%n特色是:%s",name,numbers,special);
		System.out.println();
	}	
}
