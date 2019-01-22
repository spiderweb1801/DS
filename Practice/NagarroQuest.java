package Practice;

/*import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;*/

public class NagarroQuest {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int min=0,max=0;
        
        for(int i=0;i<(s.length()-2);i++)
        {
            String sub=s.substring(i,i+3);
            char c[]=sub.toCharArray();
            
                int a=c[0];
                int b=c[1];
                int c1=c[2];
                int iSum=a+b+c1;
                
                if(i==0)
                {
                    min=iSum;
                    max=iSum;
                    smallest=sub;
                    largest=sub;
                }
                
                else{
                    if(iSum<min)
                        smallest=sub;
                    
                    if(iSum>max)
                        largest=sub;
                }
          
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return "smallst is:"+smallest + "\n"+"largest is:" + largest;
    }

    public static void main(String[] args) {
        String s="aaaZZZ";
        int k=3;
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
