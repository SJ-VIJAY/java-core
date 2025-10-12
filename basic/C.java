package basic;


class  A{
    int M = 111;
    int N = 112;
}
class  B{
    static int M = 110;
    static int N = 120;
}
class Class {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.M + obj.N);
        System.out.println(B.M - B.N);
    }
}

