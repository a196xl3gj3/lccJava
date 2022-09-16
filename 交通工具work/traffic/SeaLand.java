package traffic;
// 建立一個有海陸兩項的功能
public interface SeaLand extends DeepMaritime,Road{
	public void Chariot(); // 兩棲戰車
	
	default public void driver(){
		System.out.println("駕駛聚精會神駕駛中!!");
	}
}
