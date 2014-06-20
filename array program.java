
//Ayesha
import java.util.Scanner;
class numberComparison
{
      
      public static void main(String[] args)
      {
            int[] array = new int[10]; 
            System.out.println("Hello, please enter 10 numbers:");
            Scanner scan = new Scanner(System.in);
                  	             	 
            	for (int j =0; j<=9; j++) //takes in numbers
	            {
	            	array[j] = scan.nextInt();
	                        
           		}
           		
           		int temp=0;
           		
           		for (int n =0; n<=9; n++)
	            {
	            	if (array[0] < array[n])
	            	{
	            		temp= array[n];
	            		
	            		if (array[n] > temp)
	            		{
	            			temp = array[n];
	            		}
            		}
	                        	
                     System.out.println("temp is: "+ temp );        
           		}
           	
           		
           	//	System.out.println("The biggest number now is: "+ temp );
      }
      
      
}
				

	            	/*if (array[j]<array[n])
	            	{
	            		System.out.println("The biggest number now is: the last number entered");
	            	}*/
	            /*	else
	            	{
	              		int bNum =array[j];
	              		System.out.println("The largest number now is: " + bNum);
	            	}
	           	   */        
	           	   	           /* for (int i =0; i<9; i++)//get numbers
            {
            	  array[i] = scan.nextInt();
            	  
           
           	 System.out.println("The number you just entered is:" + array[i]); 
                     
            }
             */
           
            // for (int i =0; i<9; i++)//compare numbers
            //{
            	
            		          //  }
	            
            	           
           	 //System.out.println("" + array[i]); 