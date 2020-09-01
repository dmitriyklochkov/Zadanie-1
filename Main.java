iimport java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args)  throws IOException{
        int k = 1;


        System.out.printf("Введите N и R:\n");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int R = in.nextInt();
        if(10 <N & N <15) System.out.printf("Введите %d точек подачи:\n",N);
        else {
            if(N%10>1 & N%10<5) System.out.printf("Введите %d точки подачи:\n",N);

            if(N%10==1) System.out.printf("Введите %d точку подачи:\n",N);

            if (N%10>4||N%10==0) System.out.printf("Введите %d точек подачи:\n",N);
        }
        System.out.printf("Количество рекомендованных точек:\n",N);
        int[] a = new int[N];

        for (int i = 0; i < N; i++) a[i] = in.nextInt();
        Arrays.sort (a);
        int i = 0;
        int d = 1;

        while (i< (N-1)){

            if ((a[i+d]-a[i])>R) {k++;i++;}
            else {

                while ((i+d)<= (N-1)){
                    if((a[i+d]-a[i])>(2*R)) {i+=d; d=1; k++;break;}
                    else {
                        d++;if ((i+d)> (N-1)) {i=i+d-1; d=1;break;}
                    }
                }

            }

        }



        System.out.print(k);
    }
}
