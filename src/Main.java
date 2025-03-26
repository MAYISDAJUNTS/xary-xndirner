import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random bot = new Random();
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int[] a = new int[w];
        for (int i = 0; i < a.length; i++) {
            a[i] = bot.nextInt(20);
        }
        System.out.println(Arrays.toString(a));
        int count = 0;
        int number = scan.nextInt();
        for (int i = 0; i <a.length; i++) {
            if (a[i] == number) {
                count = count + 1;
            }
        }
        int[] b = new int[count];
        for (int i = 0; i <b.length; i++) {
            if (a[i] == number) {
                b[i]=i;
            }
        }
        System.out.println(Arrays.toString(b));
        int max= max(b);
        int min =min(b);


    }
    public static int max(int[] b){

        int max=0;
        for (int i=0; i<b.length; i++ ){
            if (b[i]<b[i+1]){
                max= b[i+1];
            } else {
                max = b[i];
            }
        }
        return max;
    }
    public static  int min(int[] b) {
        int min=0;
        for (int i=0; i<b.length; i++ ){
            if (b[i]>b[i+1]){
                min= b[i+1];
            } else {
                min = b[i];
            }
        }
        return min;
    }

}