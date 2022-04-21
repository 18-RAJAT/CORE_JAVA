package practice.OOPS.Class_Object;

public class Initialization_through_a_constructor_class_object {
    private static Initialization_through_a_constructor_class_object e1;
    private static Initialization_through_a_constructor_class_object e2;
    private static Initialization_through_a_constructor_class_object e3;
    private static Initialization_through_a_constructor_class_object e4;

    int id;
    String name;
    float fee;
    char add;

    void insert(int i,String j,float k,char l)
    {
        id = i;
        name = j;
        fee = k;
        add = l;
    }
    void display()
    {
        System.out.println(id+ " " + name + " " + fee + " " + add);
    }

    public static void main(String[]args)
    {
        Initialization_through_a_constructor_class_object.e1 = new Initialization_through_a_constructor_class_object();
        Initialization_through_a_constructor_class_object.e2 = new Initialization_through_a_constructor_class_object();
        Initialization_through_a_constructor_class_object.e3 = new Initialization_through_a_constructor_class_object();
        Initialization_through_a_constructor_class_object.e4 = new Initialization_through_a_constructor_class_object();

        e1.insert(101,"Amit",45000,'A');
        e2.insert(102,"Dmm",30000,'D');
        e3.insert(102,"John",47000,'B');
        e4.insert(202,"annie",39000,'S');

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }

}
