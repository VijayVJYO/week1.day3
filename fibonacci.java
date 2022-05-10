package selenium;

public class fibonacci {
	
	public static void main(String[] args) {
		int range=8;
		int first=0;
		System.out.println(first);
		int second=1;
		System.out.println(second);
		for(int i=1;i<=range; i++) {
			int sum=first+second;
			System.out.println(sum);
			first=second;
			second=sum;
		}
	}

}
