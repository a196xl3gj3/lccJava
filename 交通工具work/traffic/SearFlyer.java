package traffic;
// 建立海跟飛的功能，繼承多個介面
public interface SearFlyer extends Swimming,Aerial{
	public void helicopter(); // 直升機
	public void glider(); // 滑翔機
	
	
	
	default public void driver() {
		System.out.println("這個駕駛可以去天空去海洋!");
	}
	
}
