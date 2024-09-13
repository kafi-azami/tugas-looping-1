package inheritance;

//SuperClass
public class Product {
    int Number;
    String Nama;
    int Quantity;
    double Price;

    public Product(){
        Number = 0;
        Nama = "";
        Quantity = 0;
        Price = 0;
    }


    //Constructorparameter
    public Product(int Number, String Nama, int Quantity, double Price){
        this.Number = Number;
        this.Nama = Nama;
        this.Quantity = Quantity;
        this.Price = Price;
     }


    public int getNumber() {
        return this.Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getQuantity() {
        return this.Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public double getPrice() {
        return this.Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void print(){
        System.out.println("Number :"+Number);
        System.out.println("Nama :"+Nama);
        System.out.println("Quantity :"+Quantity);
        System.out.println("Price :"+Price);
    } 

    
    
}