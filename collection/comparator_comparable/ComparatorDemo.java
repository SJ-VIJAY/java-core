package collection.comparator$comparable;

public class ComparatorDemo {
    int  id;
    String name;
    double salary;
    String company;

    public ComparatorDemo(int id, String name, double salary, String company) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.company = company;
    }

    @Override
    public String toString() {
        return "UserClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }

}

