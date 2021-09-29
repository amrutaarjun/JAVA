import java.util.Scanner;

public class Merge_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int fSize, sSize, i, j, k;
	       Scanner sc = new Scanner(System.in);
	        // Input First Array
	        System.out.println("Enter Number of Elements in First Array");
	        fSize = sc.nextInt();  
	        System.out.println("Enter Number to Elements in Second Array");
	        sSize = sc.nextInt();
	   
	        int first[] = new int[100];
	        int second[] = new int[100];
	        int merged[] = new int[200];
	        
	        System.out.println("Enter " + fSize + " Numbers");
	        for (i = 0; i < fSize; i++)
	        {
	            first[i] = sc.nextInt();
	        }
	        System.out.println("Enter " + sSize + " Numbers");
	        for (i = 0; i < sSize; i++)
	        {
	            second[i] = sc.nextInt();
	        }
	        i = j = k = 0;
	        while (i < fSize && j < sSize)
	        {
	            if (first[i] <= second[j])
	            {
	                merged[k++] = first[i++];
	            }
	            else 
	            {
	                merged[k++] = second[j++];
	            }
	        }
	 
	        if (i == fSize)
	        {
	            while (j < sSize)
	                merged[k++] = second[j++];
	        }
	 
	        if (j == sSize)
	        {
	            while (i < fSize)
	                merged[k++] = first[i++];
	        }
	 
	        System.out.println("Merged Array");
	        for (i = 0; i < k; i++) 
	        {
	            System.out.print(merged[i] + " ");
	        }
	    

	}

}
