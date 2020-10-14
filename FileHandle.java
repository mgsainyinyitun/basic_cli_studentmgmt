import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class FileHandle{
	File f = null;
	FileWriter fw = null;
	String path = "";


	public FileHandle(String path){
		this.path = path;

		try{
			f = new File(path);
			f.createNewFile();
		}catch(Exception e){
			System.out.println("Some Error");
		}
		
	}

	// ["name","password","email","phone"]
	public FileHandle(String path, String caption[]){
		this.path = path;
		try{

			f = new File(path);
			
			if(f.createNewFile()){
				fw = new FileWriter(f,true); // append mode enable
				for(String data : caption){
					fw.append(data);
					fw.append(",");
				}
				fw.append("\n");
				fw.close();
			}
			

		}catch(Exception e){
			System.out.println("Some Error");
		}
	}

	public String getId(String temp){
		int f_index = 0;
		int s_index = 0;
		for(int i=0;i<1;i++){
			f_index = s_index;
			s_index = temp.indexOf(",",f_index+1);// 1
		}
		return temp.substring(f_index,s_index);
	}


	public int getId(){
		try{
			f =  new File(path);
			Scanner sc = new Scanner(f);
			sc.nextLine(); // skip header
			int count = 1;
			while(sc.hasNext()){
				count++;
				sc.nextLine();
			}
			sc.close();
			return count;
		}catch(Exception e){
			System.out.println("Some Error");
			return -1;

		}

	}
	public boolean delete(String name){
		try{
			File temp = new File("File/temp.txt");
			temp.createNewFile();
			fw = new FileWriter(temp,true);

			f = new File(path);
			Scanner sc = new Scanner(f);
			fw.append(sc.nextLine());
			fw.append("\n");

			boolean has_student = false;

			while(sc.hasNext()){
				String s_temp = sc.nextLine();
				String s_name = getName(s_temp);
				if(s_name.equals(name)){
					has_student = true;
					continue;
				}
				fw.append(s_temp);
				fw.append("\n");
			}
			fw.close();
			sc.close();
			if(!f.delete())return false;// delete students.txt
			if(!temp.renameTo(f))return false; 
			if(has_student){
				return true;
			}else
			return false;
			
		}
		catch (Exception e){
			System.out.println("Some Error");
			return false;
		}
	}

	public String getName(String temp){
		int f_index = 0;
		int s_index = 0;
		for(int i=0;i<2;i++){
			f_index = s_index;
			s_index = temp.indexOf(",",f_index+1);// 1
		}

		return temp.substring(f_index+1,s_index);
	}

	public String getClass(String temp){
		int f_index = 0;
		int s_index = 0;
		for(int i=0;i<3;i++){
			f_index = s_index;
			s_index = temp.indexOf(",",f_index+1);// 1
		}

		return temp.substring(f_index+1,s_index);

	}
	public String getGrade(String temp){
		int f_index = 0;
		int s_index = 0;
		for(int i=0;i<4;i++){
			f_index = s_index;
			s_index = temp.indexOf(",",f_index+1);// 1
		}

		return temp.substring(f_index+1,s_index);

	}
	public String getRollCall(String temp){
		int f_index = 0;
		int s_index = 0;
		for(int i=0;i<5;i++){
			f_index = s_index;
			s_index = temp.indexOf(",",f_index+1);// 1
		}

		return temp.substring(f_index+1,s_index);

	}

	public String[] getData(String name){
		try{
			f = new File(path);
			Scanner sc = new Scanner(f);
			sc.nextLine(); // skip header
			while(sc.hasNext()){
				String temp = sc.nextLine();
				String t_name = getName(temp);
				if(t_name.equals(name)){
					String data[] = {getId(temp),getName(temp),getClass(temp),
						getGrade(temp),getRollCall(temp)
					};
					sc.close();
					return data;
				}
			}
			return null;
				
		}catch(Exception e){
			System.out.println("Some Error");
			return null;

		}
	}

	public String[] getData(int id){// id >> name,....,data[]string return
		try{
			f = new File(path);
			Scanner sc = new Scanner(f);
			sc.nextLine(); // skip header
			int line=0;
			while(sc.hasNext()){
				line++;
				if(line==id){
					String temp = sc.nextLine();
					String data[] = {getName(temp),getClass(temp),
						getGrade(temp),getRollCall(temp)
					};
					sc.close();
					return data;
				}
				sc.nextLine();
			}
			sc.close();
			return null;
		}catch(Exception e){
			System.out.println("Some Error");
			return null;
		}

	}
	public boolean edit(String data[],int id){
		try{
			File temp = new File("File/temp.txt");
			temp.createNewFile(); // crete new file
			FileWriter fw = new FileWriter(temp,true);
			f = new File("File/students.txt");
			Scanner sc = new Scanner(f);
			fw.append(sc.nextLine()); // copy header
			fw.append("\n"); // new line
			int line = 0;
			while(sc.hasNext()){
				line++;
				if(line == id){
					fw.append(String.valueOf(id));
					fw.append(",");
					for(String d:data){
						fw.append(d);
						fw.append(",");
					}
					fw.append("\n");
					sc.nextLine();
					continue;
				}
				fw.append(sc.nextLine());
				fw.append("\n");
			}

			fw.close();
			sc.close();

			if(!f.delete())return false;// delete students.txt
			if(!temp.renameTo(f))return false; // rename temp.txt to students.txt
			return true;

		}catch(Exception e){
			System.out.println("Some Error");
			e.printStackTrace();
			return false;

		}

	}


	public boolean delete(int id){
		try{
			File temp = new File("File/temp.txt");
			temp.createNewFile(); // crete new file
			FileWriter fw = new FileWriter(temp,true);
			f = new File("File/students.txt");
			Scanner sc = new Scanner(f);
			fw.append(sc.nextLine()); // copy header
			fw.append("\n"); // new line
			int line = 0;
			while(sc.hasNext()){
				line++;
				if(line == id){
					sc.nextLine();
					continue;
				}
				fw.append(sc.nextLine());
				fw.append("\n");
			}

			fw.close();
			sc.close();

			if(!f.delete())return false;// delete students.txt
			if(!temp.renameTo(f))return false; // rename temp.txt to students.txt
			return true;

		}catch(Exception e){
			System.out.println("Some Error");
			e.printStackTrace();
			return false;

		}

	}

	public boolean insert(String data[],int id){
		try{
			fw = new FileWriter(path,true);// String.valueOf();
			fw.append(String.valueOf(id));
			fw.append(",");
			for(String d:data){
				fw.append(d);
				fw.append(",");
			}
			fw.append("\n");
			fw.close();
			return true;

		}catch(Exception e){
			System.out.println("Some Error");
			return false;
		}
	}

	public boolean insert(String data[]){
		CaesarCipher cc = new CaesarCipher();

		try{
			fw = new FileWriter(path,true);
			int i = 1;
			for(String d : data){
				if(i == 2 ){
					d = cc.encrypt(d);
				}

				fw.append(d);
				i++;
				fw.append(",");
			}

			fw.append("\n");
			fw.close();
			return true;

		}catch(Exception e){
			return false;
		}

	}


}

//name,password,email,phone
//Mg Mg, 242424, mgmg@gmail.com, 881545565