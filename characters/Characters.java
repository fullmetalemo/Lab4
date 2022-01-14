package characters;

import Extra.Rotation;
import objects.Objects;
import Extra.Place;

public class Characters extends ACharacters { //bc used in Main

    private Place place;
    private String name;
    private Rotation rotation;

    public Characters(String name){ //need to be connected with Main
        this.name = name;
        this.place = null;
    }
//all of these "publics" are used in text construction so we cant use protected or private
    public String StoodUp(){
        return (name + " встал");
    }

    public String WasWalking(){
        return (name + " пересаживался ");
    }

    public String Moved(Place place){
        return (" пересел на " + place.getName());
    }

    public String CameToTheEnd(){
        return (name + " кончился");
    }

    public String WasNotAbleToHold(){
        return (name + " нельзя было удержать");
    }

    public String Disturb(Objects objects){
        return ("мешал " + objects.getName());
    }

    public String CooledDown(Objects objects){
        return (name + " остыл в " + objects.getName());
    }

    public String IsMade(Objects objects){
        return (name + " будто сделан из " + objects.getName());
    }

    public String Covered(Objects objects){
        return (name + " покрылся " + objects.getName());
    }

    public String WasShining(Place place){
        return ("и сверкал над " + place.getName());
    }

    public String Grabbed(Objects objects){
        return (name + " схватил Ворчуна за " + objects.getName());
    }

    public String SittedNear(Objects objects){
        return (name + " сел рядом с " + objects.getName());
    }

    public String BeatedOut(Objects objects){
        return (name + " тоже выбивал дробь " + objects.getName());
    }

    public String PulledOut(Objects objects){
        return ("вытащил из-под " + objects.getName());
    }

    public String Glanced(Objects objects){
        return (name + " подозрительно посмотрел на " + objects.getName());
    }

    public String StartedToFall(){
        if (rotation == Rotation.DOWN){
            return (name + " стал опускаться вниз");
        }
        else {
            return (name + "стал опускаться");
        }
    }

    public void setRotation(Rotation rotation) {
        this.rotation = rotation;
    }//same stuff here

    public Rotation getRotation() {
        return rotation;
    }//try to guess why :/

    public boolean getName() {
        return false;
    }
}
