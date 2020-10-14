import java.util.Scanner;
public class EditByName{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*********************************");
		System.out.println("*       EDIT STUDENT BY NAME     *");
		System.out.println("*********************************");
		System.out.println();
		System.out.print("Enter Student's Name :::");
		String name = sc.nextLine();

		FileHandle fh = new FileHandle("File/students.txt");
		String data[] = fh.getData(name);
		String caption[] = {"Name","Class","Avg-Grade","Avg-Roll-call"};
		String edit_data []  = new String[data.length-1];
		
		for(int i=1 ; i<data.length;i++){
		System.out.print("Enter Student's "+ caption[i-1] + "("+data[i]+"):::");
		edit_data[i-1] = sc.nextLine();
		}

		int id = Integer.valueOf(data[0]); // string to integer
		//System.out.print("ID::"+id);

		if(fh.edit(edit_data,id)){
			System.out.println("Edit Successful");
		}else{
			System.out.println("Edit Not Successful");
		}
		sc.nextInt();
		
	}
}