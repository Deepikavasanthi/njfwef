Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();int n1,n2,sum=0;
    while(n!=0){
        n1=n%10;
        n2=n1*n1;
        sum+=n2;
        n=n/10;    }
        System.out.println(""+sum);