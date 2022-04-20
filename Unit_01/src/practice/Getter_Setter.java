package practice;

 public class Getter_Setter {
    private String color;

    //Getter
    public String getColor()
    {
        return color;
    }

    //Setter
    public void setColor(String c)
    {
        this.color = c;
    }

  public static void main(String[] args)
  {
      Getter_Setter get = new Getter_Setter();
      Getter_Setter get2 = new Getter_Setter();

      get.setColor("Green");
      get2.setColor("red");

      System.out.println(get.getColor());
      System.out.println(get2.getColor());
  }
}
