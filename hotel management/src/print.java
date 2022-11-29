import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int a,b,n,sum;
        int t=in.nextInt();
        int ar[]=new int[t+1];
        int ar1[]=new int[t+1];
        int ar2[]=new int[t+1];
        int i,j,k,l,p,m;
        for( i=0;i<(t);i++){
            ar[i] = in.nextInt();
            ar1[i] = in.nextInt();
            ar2[i] = in.nextInt();
        }
        for( j=0;j<(t+1);j++)
        {
            
            b=ar1[i];
        a=ar[i];
        n=ar2[i];
        for( l=0;l<n;l++)
           {  sum=0;
                for( k=0;k<=i;k++)
        { p=1;  for(m=0;m<=k;m++)
        {
            p=p*2;
        }
            sum=sum+(b*p);
        }
        sum=sum+a;
        System.out.print(sum);
        }
        System.out.println();
        }
        
        
        
        
        in.close();
    }
}