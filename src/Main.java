import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a=array();
        System.out.println("Ձեր ցուցակն է: " + Arrays.toString(a));
        int number;
        number=inputNumber();
        int count;
        count=countNumber(a, number);
         indexMinMax(count, number,a);
    }
    public static int max(int[] b) {
        int max = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
        return max;
    }
    public static int min(int[] b) {
        int min = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] < min) {
                min = b[i];
            }
        }
        return min;
    }
    public static int[] array() {
            Random bot = new Random();
            Scanner scan = new Scanner(System.in);
            System.out.print("Մուտքագրեք թվերի քանակը ");
            int array = scan.nextInt();
            int[] a = new int[array];
            for (int i = 0; i < a.length; i++) {
                a[i] = bot.nextInt(20);
            }
        return a;
    }
    public static int inputNumber(){
            Scanner scan = new Scanner(System.in);
            System.out.print("Մուտքագրեք թիվը, որը փնտրում եք: ");
            return scan.nextInt();
    }
    public static int countNumber(int[] a, int number){

        int count = 0;
        for (int i : a) {
            if (i == number) {
                count = count +1;
            }
        }
        return count;
    }
    public static  void indexMinMax(int count, int number, int[] a){
        int[] b = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                b[index] = i;
                index=index+1;
            }
        }
        if (b.length > 0) {
            System.out.println("Թիվը հանդիպվել է  " + Arrays.toString(b)+"ինդեքսներում");
            int max = max(b);
            int min = min(b);
            System.out.println("Ամենամեծ և ամենափոքր ինդեքսները: ["+max+"] ["+min+"]");
        } else {
            System.out.println("Տրված թիվը զանգվածում չի գտնվել [-1][-1]");
        }
    }
}
