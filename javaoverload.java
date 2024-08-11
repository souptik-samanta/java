import java.util.*;
class overload
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of terms and x");
        int n=sc.nextInt();
        int x=sc.nextInt();
        overload o=new overload()
    ;

    o.sumseries(n,x);
    
    
    System.out.println("Enter the value of X");
    x=sc.nextInt();
    o.sumseries(x);System.out.println();
    o.sumseries();
    
    }
    void sumseries(int n,double x)
    {double s=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                s-=x/i;
            }
            else
            {
                s+=x/i;
            }
        }
        System.out.println(" Sum of series  = "+s);
        
    }
    void sumseries(int x)
    {
        double s=0;
        for(int i=1;i<=20;i++)
        {
            s+=Math.pow(x,i);
            
            
        }
        System.out.println("Sum of series = "+s);
    }
    void sumseries()
    {
        double s=0;
        for(int i=1;i<=10;i++){
            s+=1.0/i;
        }
        System.out.println("Sum of series = "+s);
    }

}
