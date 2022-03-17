public class Parent{
  public int umur = 20;
  public String pekerjaan = "Dokter";
  
  public Parent(double gaji){
    System.out.println("Di dalam kelas parent");
  }

  public Parent(int beratBadan){
    System.out.println(beratBadan);
  }
  
  public void jalan(){
    System.out.println("Jalan maks 10 kilo" );
  }
}