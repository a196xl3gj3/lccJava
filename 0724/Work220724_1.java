
public class Work220724_1 {
	public static void main(String[] args){
		// 從外部輸入數字
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("請輸入一個數字");
		int Numbers = scan.nextInt();
		// 建立陣列
		int[] arr = {10,15,20,25,30,35,40,45,50,55};
		// 做次數加總，預設為0
		int total = 0;
        for(int i=0;i<=9;i++){
            if (arr[i] == Numbers) {
            	System.out.println("該數字"+arr[i]+"在陣列之中");
            	total += i; //做次數的加總
            }
        // 用次數判斷是否在陣列中
        }if (total != 0) {
        	System.out.println("陣列位置在:"+ total);
        }if (total == 0) {
        	System.out.println("該數字不在陣列中");
        }
	}
}
