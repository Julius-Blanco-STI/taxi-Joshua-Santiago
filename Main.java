public class Main{
    public static void main(String[]args){
        
    Taxi x = new Taxi("LUV143");
    x.run ("ur");
    x.printCurrentLocation();
     //x:____ , y:____
        x.book(1,1);
     //x.run("I am leaving on a Ftaxi");
     System.out.println(x.reachedDestination());
     //false




}

}




