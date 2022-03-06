import java.util.Scanner;

public class ClassMate {

    public static void main(String[] args) {
        int i,j,n=10,k,x=0;
        int count=0;
        for(i=1; i<=n ; i++)
            for(j=1; j<=n ; j=2*j)
                for(k=1; k<=j ; k++)
                    count++;
        System.out.println(count);
    }
}
