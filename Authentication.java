import java.io.File;
import java.util.Scanner;

public class Authentication{
	String path = "";
	File f = null;

	public Authentication(String path){
		try{
			f = new File(path);
		}catch(Exception e){
			System.out.println("Some Error");
		}
	}


	private String getName(String temp){
		int f_index = 0;
		int s_index = 0;
		for(int i=0;i<1;i++){
			f_index = s_index;
			s_index = temp.indexOf(",",f_index+1);// 1
		}

		return temp.substring(f_index,s_index);
	}

	private String getPassword(String temp){
		int f_index = 0;
		int s_index = 0;
		for(int i=0;i<2;i++){
			f_index = s_index;
			s_index = temp.indexOf(",",f_index+1);
		}
		return temp.substring(f_index+1,s_index);
	}


	public boolean checkName(String name){
		try{

		Scanner sc = new Scanner(f);
		sc.nextLine();
		while(sc.hasNext()){
			String temp = sc.nextLine();
			String temp_name = getName(temp);
			//System.out.println(temp_name);
			if(temp_name.equals(name)){
				return true;
			}

		}
		sc.close();
		return false;

	}catch(Exception e){
		System.out.println("Some Error");
		return false;
	}
	}



	public boolean checkPassword(String password){
		CaesarCipher cc = new CaesarCipher();
		password = cc.encrypt(password);

		try{
			Scanner sc = new Scanner(f);
			sc.nextLine();
			while(sc.hasNext()){
				String temp = sc.nextLine();
				String temp_pass = getPassword(temp);
				//System.out.println(temp_pass);
				if(temp_pass.equals(password)){
					return true;
				}
			}

			return false;

		}catch(Exception e){
			System.out.println("Some Error");
			return false;
		}
	}



}