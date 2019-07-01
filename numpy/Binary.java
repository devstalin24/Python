class Binary{
    public static void main(String arg[]){
        int num = 4;
        bin(num);

        System.out.println((1%2));
    }

    static void bin(int n){
        if (n>1){bin(n/2);}
        System.out.print(n%2);
    }
}