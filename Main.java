import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*********************************");
		System.out.println("*   STUDENT MANAGEMENT SYSTEM   *");
		System.out.println("*********************************");
		System.out.println();
		System.out.println("Choose Number To do Action");
		System.out.println("1. Login");
		System.out.println("2. Register ");

		System.out.print("Your Choose ::: ");
		int ans = sc.nextInt();

		if(ans == 1){
			
		try{

			String path = "cmd /c start Login.exe";
			Runtime rt = Runtime.getRuntime();
			Process pr = rt.exec(path);

		}catch(Exception e){
			System.out.println("Some Error");
		}

		}


		if(ans == 2){
		try{

			String path = "cmd /c start Register.exe";
			Runtime rt = Runtime.getRuntime();
			Process pr = rt.exec(path);

		}catch(Exception e){
			System.out.println("Some Error");
		}

		}
		
	}
}