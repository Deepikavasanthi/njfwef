public class array1 {
    public static void main(String[] args) {
        arr c1=new arr();
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size ");
        n=sc.nextInt();
        int[] c=new int[n];
        System.out.println("enter the first element of an array");
        c[0]=sc.nextInt();
        System.out.println("enter the diff between the element");
        j=sc.nextInt();
        for(i=1;i<n;i++)
        {
         c[i]=c[i-1]+j;
            System.out.println(""+c[i]);
        }
        for(i=0;i<n;i++)
        {
          c1.c2(a[i], i);
        }
    }
    
}
class arr
{
    void a1(int a,int i)
    {
        if(a==i){
            System.out.println("the element"+a+"is in the position"+i);
        }
    }
}