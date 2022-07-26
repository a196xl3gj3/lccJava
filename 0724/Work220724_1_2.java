
public class Work220724_1_2 {
	public static void main(String[] args){
		// 從外部輸入數字
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("請輸入一個數字");
		int Numbers = scan.nextInt();
		// 建立陣列
		int[][][] arr = {{{5,10,15},{20,25,30}},{{35,40,45},{50,55,60},{65,70,75}}
		,{{80,85,90,95},{100,103},{105,110,115},{120,125,130},{135,140,145}}
		,{{150,155,160,165,170},{175,180,185},{190,195,200},{205,210,215}}};
		
		// 做次數加總，預設為0
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		for(int i=0 ; i<arr.length ; i++) {
			//System.out.println(i);
			for (int x =0 ; x < arr[i].length; x++) {
//				System.out.println(x);
				for(int z=0 ; z < arr[i][x].length; z++) {
//					System.out.println(z);
				if (arr[i][x][z] == Numbers) {
	            	System.out.println("該數字"+arr[i][x][z]+"在陣列之中");
	            	total1 += i+1; //做次數的加總
	            	total2 += x+1;
	            	total3 += z;
	            	System.out.println("在第"+total1+"組陣列的第"+total2+"小組中的第"+total3+"位置");
					}
	            }
			}
         //用次數判斷是否在陣列中
        }if ((total1 == 0) && (total2 == 0) && (total3 == 0)){
        	System.out.println("該數字不在陣列中");
		}
	}	
}
