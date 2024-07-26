import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner w=new Scanner(System.in);
        int n1=w.nextInt();
        int n2=w.nextInt();
        int i,j;
        int temp;
        int x[][]=new int [n1][n2];
        for(i=0;i<n1;i++)
        {
            for(j=0;j<n2;j++)
            {
                x[i][j]=w.nextInt();
            }
        }
        for(i=0;i<n1;i++)
        {
            for(j=0;j<n2;j++)
            {
                while(x[i][j]==x[1][0])
                {
                    temp=x[1][0];
                    x[1][0]=x[1][2];
                    x[1][2]=temp;
                    break;
                }
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
