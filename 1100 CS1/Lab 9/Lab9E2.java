// Derek Neil
// Lab9 E2

// import java.util.Scanner;
		// Scanner keyboard = new Scanner(System.in);
		
public class Lab9E2 {
	public static void main(String[] args) {
		
// 	for (int i = 10; i >= 0; i--)
		int i=10;
		while(i>=0){
         System.out.print(i);
			i--;
		}
          
		int x = 5; 
//    for (int i = 0; i <= 10; i+=2){ 
		i=0;
		while(i<=10){
         x -= i;
	      System.out.println("x: " + x);
			i+=2;
		}  

//    for (int i = 0; i < 3; i++)
//       for (int j = 0; j < 4; j++){
//          for (int k = 0; k < 5; k++)
		i=0;
		int j=0, k=0;
		while( i<3 ){
			j=0;
			while( j<4 ){
				k=0;
				while( k<5 ){
         		System.out.print("*");
					k++;
					}
            System.out.println();
				j++;
				}
			i++;
      	}  
  
//		x = 10;
//    while ( x-- >= 0)
		for ( x=9; x+1>=0; x--) 
         System.out.println(x);
   
	   int num1, num2 = 2;
//    while ( num1 > 0 ){
		for ( num1 = 4; num1>0;){ 
      	num1--;
         num2 += num1;
         System.out.println(num2);  
      }
  	}
}





