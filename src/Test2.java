import java.util.Scanner;

public class Test2 {
	public static void catAndMouse(int n,int a,int b,int c) {
		
		 
		int s1= c-a;
		int s2= b-c;
		if(s1>s2) {
			System.out.println("Cat A");
			
		}
		else if(s2>s1) {
			System.out.println("Cat B");
			
		}
		else {
			System.out.println("Mouse C");
		
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter no");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		 
		catAndMouse(n,a,b,c);
		} 
		 
	}

}
