
public class ArrayRotation {
	
	public static void main(String[] args) {
		int[] input = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] out = rotateArray(input,5);
		
		for (int i = 0; i < out.length; i++) {
			System.out.println(out[i]);
		}
	}
	
	/**
	 * Runs at O(n+d)
	 * @param input
	 * @param d
	 * @return
	 */
	
	public static int[] rotateArray(int[] input, int d) {
		int n = input.length;
		int[] temp = new int[d];
		
		for (int i = 0; i < d; i++) {
			temp[i] = input[i];
		}
		
		for (int j = 0; j < n; j++) {
			if((n-d)>j) {
				input[j] = input[d+j]; 
			}else {
				input[j] = temp[j+d-n];
			}
		}
		return input;
	}

}
