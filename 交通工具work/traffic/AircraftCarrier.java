package traffic;
// 航空母艦 海空都有
public class AircraftCarrier extends Airplane{
	public AircraftCarrier(String name, int numbers, String special) {
		super(name, numbers, special);
	}
	@Override //把方法都寫在一起
	public void aerial()  {
		System.out.printf("%s在海上行駛，時速56km，放出飛機後可直接攻擊敵人%n可以乘載%d架飛機%n特色是:%s",name,numbers,special);
		System.out.println();
	}	
}
