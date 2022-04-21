package Questions;

    class Student {

    String name;
    int age;
    char section;
    int percentage;
    static int avg = 0;

    Student(String name,int age,char section,int percentage)
    {
        this.name = name;
        this.age = age;
        this.section = section;
        this.percentage = percentage;
        avg = avg + percentage;
    }
    void display()
    {
        System.out.println(avg/5);
    }
}

class Main
{
    public static void main(String[]args)
    {
        Student s1 = new Student("Rajat", 20, 'F',20);
        Student s2 = new Student("Rajat", 29, 'A',50);
        Student s4 = new Student("Rajt", 205, 'M',26);
        Student s5 = new Student("Rjat", 26, 'G',23);
        Student s6 = new Student("ajat", 10, 'O',99);
        s6.display();

    }
}
