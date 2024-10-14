import java.util.Arrays;
import java.util.Scanner;

public class InputMas {
    public static void main(String[] args) {

    /*Scanner scanner = new Scanner(System.in) ;
        System.out.println("imput a length of array");
        int lan = scanner.nextInt();
        System.out.println("imput a array with langth " + lan );
        int[] array = new int[lan];
        int k=0;
        while (k <= lan) {
        array[k] = scanner.nextInt();
        ++k ;
        if (k == lan) {
            break;
        }
        }
        scanner.close();
        System.out.println("yours array" + Arrays.toString(array)); */
        int[] array = {0,1,2,3,4,5,6,7,8,9,10} ;
       int lan = array.length;
         int k=0;
        while (k<=lan) {
            if (array[k]%2 < 1) {
                System.out.println(array[k]);
                k++;
            }
                else {
                    k++;
                }
                if (k==lan) {
                    break;

                }
            }
        }

    }

