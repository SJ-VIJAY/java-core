package singletonPattern;

public class SingletonCls {
    private static SingletonCls instance;

    private SingletonCls(){
    }
    public static synchronized SingletonCls getInstance(){

        if(instance == null) {
            instance = new SingletonCls();
            return instance;
        }
        return instance;
    }
    public static void main(String[] args) {
        System.out.println(SingletonCls.getInstance());
        System.out.println(SingletonCls.getInstance());
        System.out.println(SingletonCls.getInstance());

    }
}
