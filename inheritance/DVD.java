package inheritance;

//Subclass
public class DVD extends Product{
    int length;
    String Rating;
    String Studio;

    public DVD() {
        super();
        length = 0;
        Rating = "";
        Studio = "";
    }
        //Constructorparameter
    public DVD(int Number, String Nama, int Quantity, double Price, int length, String Rating, String Studio){
        super(Number, Nama, Quantity, Price );
        this.length = length;
        this.Rating = Rating;
        this.Studio = Studio;

    }

    

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    public String getStudio() {
        return this.Studio;
    }

    public void setStudio(String Studio) {
        this.Studio = Studio;
    }

    @Override 
    public void print(){
        super.print();
        System.out.println("length :"+length);
        System.out.println("Rating :"+Rating);
        System.out.println("Studio :"+Studio);

}
}
