import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class StriverExtractDigit {


    public static ArrayList<Integer> ExtractDigit(int N){

        ArrayList arr=new ArrayList<Integer>(N);
        while(N>0){
            int last=N%10;
            arr.add(last);
            N=N/10; 
            
        }
        Collections.reverse(arr);
        return arr;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer> Digit=ExtractDigit(N);
        for (Integer num : Digit) {
            System.out.print(num+",");
            
        }
       // System.out.println();
    }
    
}
