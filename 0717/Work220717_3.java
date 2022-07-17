//求因數，若整數A 可以被整數B 整除，則B是A的因數
// for (int i=1 ; i<=100 ; i++) 1~100之間，由使用者輸入一個數字
// 程式要印出: 1~100之間，哪些數字是該數字的因數
public class Work220717_3 {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("請從1~100中輸入一個整數:");
		int Numbers = scan.nextInt();
		System.out.println("在1~100中"+Numbers+"的因數有");
		for (int i=1 ; i<=100 ; i++) {
			if ((Numbers % i) == 0) {
				System.out.print(i+",");
			}
		}System.out.println();
	}

}
