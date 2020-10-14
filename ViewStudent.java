import java.util.Scanner;
public class ViewStudent{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*********************************");
		System.out.println("*        VIEW STUDENT INFO      *");
		System.out.println("*********************************");
		System.out.println();
		System.out.print("Enter Student's Name :::");
		String name = sc.nextLine();
		FileHandle fh = new FileHandle("File/students.txt");
		String data[] = fh.getData(name);

		//for(String d:data){
		//	System.out.println(d);
		//}
		System.out.println("Student's ID        ::: "+data[0]);
		System.out.println("Student's Name      ::: "+data[1]);
		System.out.println("Student's Class     ::: "+data[2]);
		System.out.println("Student's Grade     ::: "+data[3]);
		System.out.println("Student's Roll-Call ::: "+data[4]);

		sc.nextLine();
		
	}
}