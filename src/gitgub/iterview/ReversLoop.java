package gitgub.iterview;

public class ReversLoop {
	
	public static void main(String[] args) {
		// if we want to revers number, we should decremenet it
		
		int []number = {1, 2, 3, 4,5};
		for(int i =  number.length-1; i >=0;  i --) {
			System.out.println(number[i]);
		}
	}

}
