// 修改 99乘法表 
/* 行縱向交換
 * 2*1=2 3*1=3 4*1=4...9*1=9
 * 2*2=4 3*2=6 4*2=8...9*2=18
 */
public class Work220717_1 {
	public static void main(String[] args) {
		for (int i=1 ; i<=9; i++) {
			for (int x =1; x <= 9; x++) {
				System.out.print(x + "*" + i + "=" + i*x + "\t");// i * x = i*x
			}System.out.println();
		}
		
	}
}
