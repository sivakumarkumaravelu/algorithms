
public class MinElement {
	public static void main(String[] args) {
		int[] arr = {3,4,5,6,7,1,2};
		int max = Integer.MAX_VALUE;
		System.out.println("Integer max: "+max);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	
}
