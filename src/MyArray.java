import java.util.Random;


public class MyArray {
	int[] intArray;
	
	public void create(int n){
		intArray = new int[n];
		Random r = new Random();
		for (int i = 0; i < n; i++){
			intArray[i] = r.nextInt(10);
		}
	}
	public void show(){
		for (int i = 0; i < intArray.length; i++){
			System.out.println("Arr[" + i + "] = " + intArray[i]);
		}
	}

}
