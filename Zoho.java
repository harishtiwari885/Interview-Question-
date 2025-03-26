/*
Pattern Printing Question (Asked by Zoho)

Problem Statement:
Write a program to print the following pattern based on a given integer n.

Example:
For n = 6, the output should be:
1  
2 4  
3 5 7  
6 8 10 12  
9 11 13 15 17  
14 16 18 20 22 24  

Constraints:
- 1 ≤ n ≤ 100  
- The first row starts with 1.  
- Odd-indexed rows contain odd numbers.  
- Even-indexed rows contain even numbers.  
- Numbers increase sequentially in each row.  

Input:
An integer n (number of rows).  

Output:
Print the pattern as shown above.
*/

public class Zoho {
    public static void main(String[] args){
        int rows = 6; // Change this value for different inputs
        int ev = 2;  // Tracks even numbers
        int od = 1;  // Tracks odd numbers
        
        for(int a = 1 ; a <= rows ; a++){
            for(int b = 1 ; b <= a ; b++){
                if(a % 2 == 0){
                    System.out.print(ev + " ");
                    ev += 2;
                }
                else{
                    System.out.print(od + " ");
                    od += 2;
                }
            }
            System.out.println();
        }
    }
}