
public class Work220724_2 {
	// 定義一個方法
	static void bubble(int[] arr) {
		// 預設 n 為 陣列 arr 的長度
		int x = arr.length;
		int temp = 0;
		for(int i=0 ; i<x ; i++) {
			// 比較後就往下走
			for(int j=1 ; j<=(x-1) ; j++) {
				// 比較左右邊陣列
				if(arr[j-1] > arr[j]) {
				// 比較後交換元素
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {40, 80, 50, 10, 70, 100, 90, 20, 60, 30};
		
		System.out.println("原本的排序");
		for(int i=0 ; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// 開始泡沫排序，帶入陣列參數
		bubble(arr);
		// 排序後呈現
		System.out.println("使用泡沫排序");
//		for(int i=0 ; i< arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		// 變數的型態是甚麼，就必須要甚麼來做
		for(int a:arr) { //foreach 從陣列 0~9 結束就離開
			System.out.print(a + " ");
		}
		System.out.println();
		
	}
}
