// 二維陣列，做檢查數字的位置。
public class Work220724_1_1 {
	public static void main(String[] args){
		// 從外部輸入數字
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("請輸入一個數字");
		int Numbers = scan.nextInt();
		// 建立陣列
		int[][] arr = {{10,15,20},{25,30,35},{40,45,50,55},{60,65,70},{75,82,85}};
		
		// 做次數加總，預設為0
		int total = 0;
		int total1 = 0;
		for(int i=0 ; i<arr.length ; i++) {
			for (int x =0 ; x < arr[i].length; x++) {
				if (arr[i][x] == Numbers) {
	            	System.out.println("該數字"+arr[i][x]+"在陣列之中");
	            	total += i+1; //做次數的加總
	            	total1 += x;
	            	System.out.println("在第"+total+"組陣列的第"+total1+"位置");
	            }
			}
        // 用次數判斷是否在陣列中
        }if ((total == 0) && (total1 == 0)) {
        	System.out.println("該數字不在陣列中");
        }
	}
}
