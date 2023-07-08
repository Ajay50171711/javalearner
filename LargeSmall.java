package labprogram;

public class LargeSmall {

	public static void main(String[] args) {
		
		 int intArray[] = new int[]{ 3,5,1,6,3,8,9,0,4,12 }; 
		 int small=intArray[0];
		 int large=intArray[0];
		 
		 for(int i=0;i<10;i++)
		 {
			 if(intArray[i]>large)
			 {
				 large=intArray[i];
		 }
			 if(intArray[i]<small)
			 {
				 small=intArray[i];
		 }
			 

	}
		 System.out.println("smallest in array is:"+small);
		 System.out.println("largest in array is:"+large);

}
}
