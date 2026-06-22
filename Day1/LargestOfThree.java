import java.util.Scanner;
class LargestOfThree{
	pubic static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int ans;
		if(a>b && a>c) ans = a;
		else if(b>a && b>c) ans = b;
		else ans = c;
		
		System.out.println(ans);
	}
}
