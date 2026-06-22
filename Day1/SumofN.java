  import java.util.Scanner;
class SumofN{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int r = (n*(n+1))/2;
		System.out.println(r);
	}
}
