import java.util.Scanner;
public class StudentMgmt{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*********************************");
		System.out.println("*      STUDENT MANAGEMENT       *");
		System.out.println("*********************************");
		System.out.println();
		System.out.println("1. Add Student");
		System.out.println("2. Delete Student");
		System.out.println("3. Edit Student's Information");
		System.out.println("4. View Student's Information");
		System.out.print("Your Choose :::");
		int ans = sc.nextInt();
		switch(ans){
			case 1:try{
						String path = "cmd /c start AddStudent.exe";
						Runtime rt = Runtime.getRuntime();
						Process pr = rt.exec(path);
						break;
						}catch(Exception e){
							System.out.println("Some Error");}

			case 2:try{
						String path = "cmd /c start DeleteStudent.exe";
						Runtime rt = Runtime.getRuntime();
						Process pr = rt.exec(path);
						break;
						}catch(Exception e){
							System.out.println("Some Error");}


			case 3:try{
						String path = "cmd /c start EditStudent.exe";
						Runtime rt = Runtime.getRuntime();
						Process pr = rt.exec(path);
						break;
						}catch(Exception e){
							System.out.println("Some Error");}
			case 4:try{
						String path = "cmd /c start ViewStudent.exe";
						Runtime rt = Runtime.getRuntime();
						Process pr = rt.exec(path);
						break;
						}catch(Exception e){
							System.out.println("Some Error");}
			default:System.out.println("Invalid Number!");break;

		}

	}

}