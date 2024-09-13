package inheritance;

// Subclass 
public class Cd extends Product {
    String Artist;
    int Numsong;
    String Label;

    public Cd() {
        super(); //mengakses Constructor Superclass
        Artist = "";
        Numsong = 0;
        Label = "";
    }

     //Constructorparameter
     public Cd(int Number, String Nama, int Quantity, double Price, String Artist, int Numsong, String Label){
        super(Number, Nama, Quantity, Price );
        this.Artist = Artist;
        this.Numsong = Numsong;
        this.Label = Label;
     }


    public String getArtist() {
        return this.Artist;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public int getNumsong() {
        return this.Numsong;
    }

    public void setNumsong(int Numsong) {
        this.Numsong = Numsong;
    }

    public String getLabel() {
        return this.Label;
    }

    public void setLabel(String Label) {
        this.Label = Label;
    }

    @Override //method yang sama dengan method di superclass
    public void print(){
        super.print();
        System.out.println("Artist :"+Artist);
        System.out.println("Numsong :"+Numsong);
        System.out.println("Label :"+Label);
        
    }
    
}