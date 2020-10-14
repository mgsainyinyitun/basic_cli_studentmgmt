import java.util.Scanner;
public class Login{
	public static void main(String[] args) {
		Authentication au = new Authentication("File/account.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("*********************************");
		System.out.println("*    LOGIN WITH YOUR ACCOUNT    *");
		System.out.println("*********************************");
		System.out.println();
		System.out.print("Enter Your User Name :::");
		String name = sc.nextLine();
		System.out.print("Enter Your Password ::: ");
		String password = sc.nextLine();	

		if(au.checkName(name)){
			System.out.println("User Name is Correct");
			if(au.checkPassword(password)){
			System.out.println("Your password is correct");

			try{
				String path = "cmd /c start StudentMgmt.exe";
				Runtime rt = Runtime.getRuntime();
				Process pr = rt.exec(path);

				}catch(Exception e){
					System.out.println("Some Error");}

			}
				else{
				System.out.println("Your Password is incorrect");
			}
		}
		else{
			System.out.println("Your are not registered");
		}
}
}