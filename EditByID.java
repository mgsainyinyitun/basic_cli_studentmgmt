import java.util.Scanner;
public class EditByID{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*********************************");
		System.out.println("*       EDIT STUDENT BY ID      *");
		System.out.println("*********************************");
		System.out.println();
		System.out.print("Edit Student's ID :::");
		int id = sc.nextInt();
		// get all data 
		// edit 
		FileHandle fh = new FileHandle("File/students.txt");
		String data[] = fh.getData(id);
		String caption[] = {"Name","Class","Avg-Grade","Avg-Roll-call"};
		String edit_data []  = new String[data.length];
		Scanner scs = new Scanner(System.in);
		for(int i=0 ; i<data.length;i++){
		System.out.print("Enter Student's "+ caption[i] + "("+data[i]+"):::");
		edit_data[i] = scs.nextLine();
		}

		if(fh.edit(edit_data,id)){
			System.out.println("Edit Successful");
		}else{
			System.out.println("Edit Not Successful");
		}
		sc.nextInt();

	}
}