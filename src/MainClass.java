
public class MainClass {

	public static void main(String[] args) {
		System.out.println("Hello it's a Main Class of my project");
		MyArray arr = new MyArray();
		arr.create(2);
		arr.show();
		
		MyString str = new MyString("My string");
		str.show();
	}

}
