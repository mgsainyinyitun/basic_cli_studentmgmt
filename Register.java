import java.util.Scanner;
public class Register{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*********************************");
		System.out.println("*     REGISTER YOUR ACCOUNT     *");
		System.out.println("*********************************");
		System.out.println();
		// name, password, email, phone <string>
		System.out.println("Enter Your Information Correctly");
		System.out.print("Name ::: ");
		String name = sc.nextLine();
		System.out.print("Password ::: ");
		String password = sc.nextLine();
		System.out.print("Email ::: ");
		String email = sc.nextLine();
		System.out.print("Phone :::");
		String phone = sc.nextLine();
		String caption[] = {"name","password","email","phone"};
		String data[] = {name,password,email,phone};

		FileHandle fh = new FileHandle("File/account.txt",caption);

		if(fh.insert(data)){
			System.out.println("Your Data is Successfully Saved");
		}else{
			System.out.println("Some Error Saving Your Data! Please try Again");
		}


		System.out.print("Enter <y> to Exit:::");
		String s = sc.nextLine();
		if(s.equals("y"));

	}
}