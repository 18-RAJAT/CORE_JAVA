//Question->

// Create a class “Student” having following instance variables and methods.
//        Instance variables: ID, Name, Branch, city and university
//        While creating constructors with one, two, three, four and five arguments reuse the
//        constructors by construction chaining



package Assessment;

class abc {
    int rollNo;
    String name;
    String branch;
    String city;
    String university;

    abc(int rollNo)
    {
        this.rollNo=rollNo;
    }
    abc(int rollNo,String name)
    {
        this(rollNo);
        this.rollNo=rollNo;
        this.name=name;
    }
    abc(int rollNo,String name,String branch)
    {
        this(rollNo,name);
        this.rollNo=rollNo;
        this.name=name;
        this.branch=branch;
    }
    abc(int rollNo,String name,String branch,String city)
    {
        this(rollNo,name);
        this.rollNo=rollNo;
        this.name=name;
        this.branch=branch;
        this.city=city;
    }
    abc(int rollNo,String name,String branch,String city,String university)
    {
        this(rollNo,name);
        this.rollNo=rollNo;
        this.name=name;
        this.branch=branch;
        this.city=city;
        this.university=university;
    }
    void display()
    {
        System.out.println("name " + name);
        System.out.println("rollNumber "+rollNo);
        System.out.println("branch "+branch);
        System.out.println("city "+city);
        System.out.println("university "+university);
    }
    public static void main(String[]args)
    {
        abc student=new abc(18,"Rajat","CSE","UK","GEHU");
        student.display();
    }
}
