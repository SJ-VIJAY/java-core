package collection.comparator$comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Product implements Comparable<Product> {

    int productId;
    String productName;
    String productCategory;
    double productPrice;

    public Product(int productId, String productName, String productCategory, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
    }
    @Override
    public String toString() {
        return " {" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productPrice=" + productPrice +
                '}' + "\n";
    }
    public int compareTo(Product pro) {
        return 0;
    }
}
public class Task {
    public static Scanner sc = new Scanner(System.in);
        static ArrayList<Product> al = new ArrayList();


    public static void id() {
        Comparator<Product> m1 = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.productId - o2.productId;
            }
        };
        Collections.sort(al,m1);
        System.out.println(al);
    }
    public static void name() {
        Comparator<Product> m2 = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.productName.compareTo( o2.productName) ;
            }
        };
    }
    public static void category() {
        Comparator<Product> m3 = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.productCategory.compareTo(o2.productCategory) ;
            }
        };
    }
    public static void price() {
        Comparator<Product> m4 = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.productPrice,o2.productPrice);
            }
        };
    }
    public static void main(String[] args) {

        Product p1 = new Product(1234, "Samsung", "Mobile", 20000);
        Product p2 = new Product(1222, "Oppo", "Mobile", 15000);
        Product p3 = new Product(1111, "RealMe", "Mobile", 40000);
        Product p4 = new Product(1100, "Apple", "Mobile", 30000);

        Product p5 = new Product(1234, "Samsung", "Laptop", 40000);
        Product p6 = new Product(1222, "Hp", "Laptop", 45000);
        Product p7 = new Product(1111, "Dell", "MLaptop", 34000);
        Product p8 = new Product(1100, "Apple", "Laptop", 60000);

        Product p9 = new Product(1234, "Redmi", "Tab", 10000);
        Product p10 = new Product(1222, "Samsung", "Tab", 9000);
        Product p11 = new Product(1111, "MicroMax", "Tab", 8000);
        Product p12 = new Product(1100, "Apple", "Tab", 30000);

        al.add(p1);
        al.add(p2);
        al.add(p3);
        al.add(p4);
        al.add(p5);
        al.add(p6);
        al.add(p7);
        al.add(p8);
        al.add(p9);
        al.add(p10);
        al.add(p11);
        al.add(p12);
        Collections.sort(al);
        //System.out.println(al);

        while(true) {
            System.out.println("Choice is yours ...");
            System.out.println("1.id ");
            System.out.println("2.name ");
            System.out.println("3.category");
            System.out.println("4.price ");
            System.out.println("5.exit ");
            System.out.println(">>>>>>>>>>>>");

            System.out.println("Enter your choice...");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Asc / Des");
                    String st = sc.next();
                    if(st.equals("Asc")) {
                        id();
                    }

                case 2:
                    System.out.println("Asc / Des");
                    String st1 = sc.next();
                    if(st1.equals("Asc")) {
                        name();
                    }
                case 3:
                    System.out.println("Asc / Des");
                    String st2 = sc.next();
                    if(st2.equals("Asc")) {
                        category();
                    }
                case 4:
                    System.out.println("Asc / Des");
                    String st3 = sc.next();
                    if(st3.equals("Asc")) {
                       price();
                    }
                case 5:
                    break;

            }
        }
    }

    }







