public class Child extends Parent{

  public int umur = 15;
  public String pekerjaan = "Musisi";
  
  public Child(){
    super(60.00);
  }
  
  @Override
  public void jalan(){
    System.out.println("Jalan maks 20 kilo ");
  }
}