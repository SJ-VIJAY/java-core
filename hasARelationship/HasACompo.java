package hasARelationship;

class Mobile{
    private String mobileName;
    private MobileDetails md;

    public Mobile(String mobileName,String model, double price, String made) {
        this.mobileName = mobileName;
        this.md = new MobileDetails(model,price,made);
    }

    void display(){
        System.out.println("Mobile name: "+mobileName);
        System.out.println("Model: "+md.getModel());
        System.out.println("Price: "+md.getPrice());
        System.out.println("Made Country: "+md.getMade());
    }
}
class MobileDetails{
    private String model;
    private double price;
    private String made;

    public MobileDetails(String model, double price, String made) {
        this.model = model;
        this.price = price;
        this.made = made;
    }

    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    public String getMade() {
        return made;
    }
}
public class HasACompo {
    public static void main(String[] args) {
        Mobile ob = new Mobile("Realme","12pro",20000,"Made in India");
       ob.display();
    }
}
