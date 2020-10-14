import java.util.Scanner;
public class EditStudent{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*********************************");
		System.out.println("*       EDIT STUDENT INFO       *");
		System.out.println("*********************************");
		System.out.println();
		System.out.println("1. Edit Student's by ID");
		System.out.println("2. Edit Student's by Name");
		System.out.print("Your Choose ::: ");
		int ans = sc.nextInt();
		if(ans==1){
			try{
				String path = "cmd /c start EditByID.exe";
				Runtime rt = Runtime.getRuntime();
				Process pr = rt.exec(path);

				}catch(Exception e){
				System.out.println("Some Error");}

		}
		else if(ans==2){
			try{
				String path = "cmd /c start EditByName.exe";
				Runtime rt = Runtime.getRuntime();
				Process pr = rt.exec(path);

				}catch(Exception e){
				System.out.println("Some Error");}

		}
		else{
			System.out.print("Invalid Number!");
		}
	}

}