package traffic;
// 坦克登入艇
// 類別實作介面，裡面的方法都要被實作出來
public class TankCraft implements SeaLand{

	@Override //深海運行
	public void DeepMar() {
		// TODO Auto-generated method stub
		System.out.println("在深海中，加速運行");
	}

	@Override  // 海上
	public void maritime() {
		// TODO Auto-generated method stub
		System.out.println("探出頭來，準備放出戰車");
	}

	@Override // 路上
	public void road() {
		// TODO Auto-generated method stub
		System.out.println("戰車在路上行走，阻殲來犯之敵");
	}

	@Override // 兩棲戰車
	public void Chariot() {
		// TODO Auto-generated method stub
		System.out.println("這是一台可以在海上在路上行走的戰車");
	}

}
