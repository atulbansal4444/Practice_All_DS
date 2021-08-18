//BracketCombinations
/* 
Have the function BracketCombinations(num) read num which will be an integer greater than or equal to zero, and return the number of valid combinations that can be formed with num pairs of parentheses. For example, if the input is 3, then the possible combinations of 3 pairs of parenthesis, namely: ()()(), are ()()(), ()(()), (())(), ((())), and (()()). There are 5 total combinations when the input is 3, so your program should return 5.
*/

import java.util.*; 
import java.io.*;

class Main {

  public static int BracketCombinations(int num) {
    // code goes here  
     int []arr = new int[num + 1];
     arr[0] = 1;
     arr[1] = 1;

     for (int i=2;i<=num;i++)
     {
        int inside = i - 1;
        int outside = 0;

        while(inside >= 0)
        {
          arr[i] += arr[inside]*arr[outside];
          inside--;
          outside++;
        }
     }

    return arr[num];
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(BracketCombinations(s.nextLine())); 
  }

}