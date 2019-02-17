
/*
 * Number of sub arrays having sum exactly equal to K
 */
public class SubArraySum {

	public static void main(String[] args) {
		
		int[] intArray = {9,4,20,3,10,5};
		
		int k = 33;
		
		boolean sumFound = subArraySum(intArray, intArray.length, k);
		
		System.out.println(sumFound);

	}
	
	public static boolean subArraySum(int[] array, int length, int k){
		
		for(int i=0 ; i < (1<<length) ; i++){
			
			int sum=0;
			for(int j=0;j<length;j++){
				
				if((i>>j&1) == 1){
					sum+=array[j];
					System.out.println(array[j]);
				}
					
			}
			System.out.println(".....................");
			if(sum == k)return true;
			
		}
		return false;
	}

}
