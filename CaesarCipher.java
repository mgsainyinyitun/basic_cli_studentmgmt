public class CaesarCipher{

	private int shift = 0;

	// constructor
	public CaesarCipher(){
		this.shift = 3; // default is shift 3
	}

	public CaesarCipher(int shift){
		this.shift = shift;
	}

	public void setShift(int shift){
		this.shift = shift;
	}

	public int getShift(){
		return this.shift;
	}

	public  String encrypt(String plaintext){
		String ciphertext = "";
		for(int i=0;i<plaintext.length();i++){
			// between a to z
			char temp = plaintext.charAt(i);

			if( temp >= 'a' && temp <= 'z'){

				temp = (char)(temp + shift);

				if( temp > 'z' ){
					temp = (char)(temp - 'a' - 'z' - 1);
				}

			}

			if( temp >= 'A' && temp <= 'Z'){
				temp = (char)(temp + shift);
				if(temp > 'Z'){
					temp = (char)(temp - 'A' -'Z' -1);
				}

			}

			ciphertext = ciphertext + temp;

		}

		return ciphertext;

	} 


	public String decrypt(String ciphertext){
		String plaintext = "";

		for(int i=0; i<ciphertext.length();i++){
			char temp = ciphertext.charAt(i);

			if(temp >= 'a' && temp <= 'z'){
				temp = (char)(temp - shift);

				if( temp < 'a' ){
					temp = (char)(temp + 'z' - 'a' + 1);
				}
			}


			if(temp >= 'A' && temp <= 'Z'){
				temp = (char)(temp - shift);
				if(temp < 'A' ){
					temp = (char)(temp + 'Z' - 'A' + 1);
				}
			}


			plaintext = plaintext + temp;


		}

		return plaintext;

	}


}