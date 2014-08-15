package examples;

public class MyCharacter {

	public static void main(String[] args) {
		int eng = 26; //26 letters consist English alphabet
		int eng_A = 65; // letter 'A' is '65' in integer
		int eng_a = 97; // letter 'a' is '97' in integer
		int rus = 32; // 33 letters in Russian alphabet
		int rus_A = 1040; // letter 'A' is '1040' in integer
		int rus_a = 1072; // letter 'a' is 1072 in integer
		
		print(16, 33, 0);
		print(eng, eng_A, (eng_a-(eng_A+eng)));
		print(rus, rus_A, (rus_a-(rus_A+rus)));
		
		
	}
	public static void print(int alphbetSize, int firstLetterPosition, int delta){
		System.out.println("\nNum Char    Int;\tNum Char    Int");
		for (int i = 0; i < alphbetSize; i++){
			System.out.printf("%2d    %s  -  %3d;\t%2d    %s  -  %3d %n", 
							i+1, (char) (firstLetterPosition + i), (int) firstLetterPosition + i, 
							i+1+alphbetSize, (char) (firstLetterPosition + alphbetSize + delta + i), 
							(int) (firstLetterPosition + alphbetSize + delta + i));
		}
	}
}
