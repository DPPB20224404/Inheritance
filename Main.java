class Main {
  public static void main(String[] args) {
    Parent anak  = new Child(); // Contoh pembuatan object yang mentrigger Virtual Method Invocation
    Child anak2 = new Child();
    System.out.println("Umur adalah : " + anak.umur);
    anak.jalan();
  }
}