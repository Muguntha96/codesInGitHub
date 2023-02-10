package pract.org;

public class Practize01 {
	
	
	public static void main(String[] args) {
		int[] n= {10,30,20,40,50};
		System.out.println("Original array");
		Practize01 arr=new Practize01();
		arr.original(n);
		System.out.println("\nReverese array");
		arr.reverse(n);
	}
	
public int[] original(int n[]) {
	for (int i = 0; i < n.length; i++) {
		System.out.print(n[i] + " ");
		
		
	}
	return n;

	

}

public int[] reverse(int n[]) {
	for (int i = n.length-1; i>=0; i--) {
		System.out.print(n[i] + " ");
		
	}
	return n;

}
		
	
	
	
	


}
