/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AdminSC
 */
public class Q1 {

    // a. Write a recursive method to find the smallest element in an array   
    
     
   public static int findMinimum(int[] A, int n){
       
       if(n==1){
           return A[0];
       }else{
           return Math.min(A[n-1], findMinimum(A, n-1));
       }
   }
}
     
 

    //b. Write a recursive method to compute the sum of the elements in an array.     
    
    /*
    public static int sum(int[] value, int n){  // n: no.of element
        if(n==0){
            return 0;
       }else{
            return value[n-1] + sum(value, n-1) ;  // in sum(value, n-1), n-1 is used because value.length starts with digit 1 and NOT digit 0. 
        }                                          // however, in value[n-1], we put n-1, n based on the above method sum(value,n) is now assumed as n-1. 
                                                   //Why? because we wrote : -> return sum(value, n-1)
    }                                              //                           highlight *n-1*
}
     */ 
    /* explanation b
    
   | n  |  n-1  | value[n-1] |   Recursion call    |  return
     6      5        34        value[5]+ sum(5, 4)    34 + 10
     5      4        10        value[4]+ sum(4, 3)    44 + 3
     4      3         3        value[3]+ sum(3, 2)    47 + 2
     3      2         2        value[2]+ sum(2, 1)    49 + 1
     2      1         1        value[1]+ sum(1, 0)    50 + 6
     1      0         6        value[0]+ sum(0,-1)    56 + 0   = 56
    Since n=0, we return 0, therefore return -> value[0]+ sum(0,-1) 
                                             ->      56 + 0   = 56       
                                                        
    */

    
    /*c. Write a recursive method that find the greatest common divisor of two given
integers. The GCD of x and y is defined recursively as follows. If y is equal to
0, then gcd(x, y) is x. Otherwise, gcd(x, y) is gcd(y, x%y). */
    
    /*
    public static int GCD(int x, int y){
        if(y==0){
        return x;
        }else{
            return GCD(y, x%y);
        }
    }
}
*/
    /* explanation c
    | x | y | x%y | Recursion call
     18   12    6   GCD(12, 6)
     12    6    0   GCD(6,0)
      6    0    0   GCD(0,0)
    Since y==0, therefore the recursion ends, thus returns x.
    x is 6.
    */
 
    
    //d. Write a recursive method that convert decimal to binary.
    /*
    public static void convertDectoBin(int dec){
        
        if(dec==0){
            System.out.println("*");
        } else {
            convertDectoBin(dec/2);
            System.out.print(dec%2);            
        }
    }
    */
        /* 
      | dec |     Recursion call    |  dec%2 |
        100     convertDectoBin(50)     0
         50     convertDectoBin(25)     0
         25     convertDectoBin(12)     1
         12     convertDectoBin(6)      0
          6     convertDectoBin(3)      1
          3     convertDectoBin(1)      1
          1     convertDectoBin(0)      1
          0           " "
    Since dec==0, therefore print " ".
    Then, print the rest
    */
   
    
    //e. Write a recursive method that computes the sum of the first n cubes.

    
    /* 
    public static int sumofNcubes(int n){
        if(n==0){
            return 0;
        }else{
            return n*n*n + sumofNcubes(n-1);
            
        }
    }
}    
*/
/*
   n | recursive call
   3    3*3*3 + sumofNcubes(2)
   2    2*2*2 + sumofNcubes(1)
   1    1*1*1 + sumofNcubes(0)
   0    0

Then, return digits from the bottom -> 1 + 8 + 27 = 36
*/