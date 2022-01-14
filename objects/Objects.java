package objects;
import Extra.Place;

public class Objects extends AObject {

    private Place place;
    private final String name;

    public Objects(String name, Place place){
        this.name = name;
        this.place = place;
    }

    public Objects(String name){
        this.name = name;
    }

    public static boolean equals(String noun, String худой) {
        return false;
    }

    public String getName(){
        return name;
    }

    public Place getPlace(){
        return place;
    }

}