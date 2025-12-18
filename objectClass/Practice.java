package objectClass;



public class Practice implements Cloneable {
    String name = "Vijay";
    int id = 1234;
    public static void main(String[] args) {

        Practice pr = new Practice();
        System.out.println(pr.name);
        System.out.println(pr.id);

        System.out.println("Get class method: "+pr.getClass());

        String s1 = "i am java developer";
        String s2 = "i am java developer";
        System.out.println(s1.equals(s2));
        try {
            Practice pr1 = (Practice)pr.clone();
            System.out.println(pr1.name);
            System.out.println(pr1.id);
            pr1.name = "vinu";
            pr1.id  = 9999;
            System.out.println(pr1.name);
            System.out.println(pr1.id);
        }catch (Exception e){}


    }
}
