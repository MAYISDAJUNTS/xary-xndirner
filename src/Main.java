import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random bot = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("Մուտքագրեք թվերի քանակը ");
        int array = scan.nextInt();
        int[] a = new int[array];


        for (int i = 0; i < a.length; i++) {
            a[i] = bot.nextInt(20);
        }
        System.out.println("Ձեր ցուցակն է: " + Arrays.toString(a));
        System.out.print("Մուտքագրեք թիվը, որը փնտրում եք: ");
        int number = scan.nextInt();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                count++;
            }
        }
        int[] b = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                b[index] = i;
                index=index+1;
            }
        } System.out.println("Թիվը հանդիպվել է  " + Arrays.toString(b)+"ինդեքսներում");
        if (b.length > 0) {
            int max = max(b);
            int min = min(b);
            System.out.println("Ամենամեծ և ամենաթոքր ինդեքսները: ["+max+"] ["+min+"]");
       } else {
            System.out.println("Տրված թիվը զանգվածում չի գտնվել [-1][-1]");
        }
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
}
