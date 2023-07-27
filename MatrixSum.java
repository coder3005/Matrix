/* Sum of Two Matrix */
import java.util.Scanner;
class A 
{
    public static void main(String[] args) {
        
        int a[][]=new int [2][2];
        int b[][]=new int [2][2];
        int c[][]=new int [2][2];
        Scanner r=new  Scanner(System.in);
        System.out.print("Enter first matrix Data ");
        for(int i=0;i<2;i++) // rows
        {
            for(int j=0;j<2;j++) // columns
            {
                a[i][j]=r.nextInt();
            }
        }
        System.out.print("Enter second matrix Data ");
        for(int i=0;i<2;i++) // rows
        {
            for(int j=0;j<2;j++) // columns
            {
                b[i][j]=r.nextInt();
            }
        }
        System.out.print("First Matrix \n");
        for(int i=0;i<2;i++) // rows
        {
            for(int j=0;j<2;j++) // columns
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("Second Matrix \n");
        for(int i=0;i<2;i++) // rows
        {
            for(int j=0;j<2;j++) // columns
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("Sum of two Matrix \n");
        for(int i=0;i<2;i++) // rows
        {
            for(int j=0;j<2;j++) // columns
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}
