import java.util.Scanner;
// ID,Name,Class,Avg Grade,Avg roll-call

public class AddStudent{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************");
		System.out.println("*         ADD NEW STUDENT        *");
		System.out.println("**********************************");
		System.out.println();
		System.out.println("**********************************");
		System.out.print("Enter Student's Name :::");
		String name= sc.nextLine();
		System.out.print("Enter Student's Class :::");
		String s_class = sc.nextLine();
		System.out.print("Enter Student's Average Grade :::");
		String grade = sc.nextLine();
		System.out.print("Enter Student's Average roll-call :::");
		String roll_call = sc.nextLine();

		String data[] = {name,s_class,grade,roll_call};
		String caption[] = {"ID","Name","Class","Avg_Grade","Avg_Roll-Call"};

		FileHandle fh = new FileHandle("File/students.txt",caption);
		int id = fh.getId();
		//System.out.println(id);
		if(fh.insert(data,id)){
			System.out.println("Your data has been successfully saved");
		}
		else{
			System.out.println("Cannot Save Your Data");

		}
		System.out.println("Enter <y> to exit the program");
		String s =  sc.nextLine();
	}

}