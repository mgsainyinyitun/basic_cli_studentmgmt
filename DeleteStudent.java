import java.util.Scanner;
public class DeleteStudent{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*********************************");
		System.out.println("*        DELETE STUDENT         *");
		System.out.println("*********************************");
		System.out.println();
		System.out.println("1. Delete By Student's ID");
		System.out.println("2. Delete By Student's Name");
		System.out.print("Your Choose ::: ");
		int ans = sc.nextInt();

		FileHandle fh = new FileHandle("File/students.txt");

		if(ans == 1){
			System.out.print("Enter ID your want to Delete :::");
			int id = sc.nextInt();
			if(fh.delete(id)){
				System.out.println("Delete Successful");
			}
			else{
				System.out.println("Delete Not Successful");
			}
		}
		else if(ans == 2){
			System.out.print("Name of Student to delete:::");
			Scanner scs = new Scanner(System.in);
			String name = scs.nextLine();

			if(fh.delete(name)){
				System.out.println("Delete Successful");
			}
			else{
				System.out.println("Delete Not Successful");
			}
		}
		else{
			System.out.println("Invalid Number");
		}
		
		sc.nextInt();

		
	}

}