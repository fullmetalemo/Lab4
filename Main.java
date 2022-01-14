//
import characters.Characters;
import Extra.*;
import objects.Objects;
import java.util.Scanner;
public class Main { //we can't make main class private

    public static void main(String[] args) {//must connect with other classes to compile program
        //main characters
        Characters AirBalloon = new Characters("Воздушный шар");
        Characters Grumpy = new Characters("Ворчун");
        Characters Falling = new Characters("Падение");
        Characters StockOfBags = new Characters("Запас мешков");
        Characters Air = new Characters("Воздух");
        Characters Tube = new Characters("Тюбик");
        Characters Dunno = new Characters("Незнайка");

        //some important locations (which are actually not locations nvm)
        Place HeadsOfBabies = new Place("головами малышей");
        Place AnotherPlace = new Place("другое место");

        //passive objects
        Objects Frost = new Objects("инеем");
        Objects Shell = new Objects("оболочке");
        Objects Others = new Objects("другим");
        Objects Silver = new Objects("чистого серебра");
        Objects Teeth = new Objects("зубами");
        Objects Him = new Objects("него");
        Objects TubeButPassive = new Objects("Тюбиком");
        Objects Collar = new Objects("шиворот ");
        Objects OnePlace = new Objects("лавки");

        //конструкции для лямбда-выражений
        Construction constructionDot;
        constructionDot = () -> ".";

        Construction constructionAnd;
        constructionAnd = () -> "и ";

        Construction constructionComma;
        constructionComma = () -> ",";

        //construction for building our text
        System.out.println(Grumpy.SittedNear(TubeButPassive) + constructionComma.buildConstruction() + Tube.BeatedOut(Teeth) + constructionDot.buildConstruction());
        System.out.println(Grumpy.Glanced(Him) + constructionDot.buildConstruction());
        System.out.println(Grumpy.StoodUp() + constructionComma.buildConstruction() + Grumpy.Moved(AnotherPlace) + constructionDot.buildConstruction());
        System.out.println(Grumpy.WasWalking() + constructionAnd.buildConstruction() + Grumpy.Disturb(Others) + constructionDot.buildConstruction());
        System.out.println(AirBalloon.Covered(Frost) + constructionAnd.buildConstruction() + AirBalloon.WasShining(HeadsOfBabies) + constructionDot.buildConstruction());
        System.out.println(AirBalloon.IsMade(Silver) + constructionDot.buildConstruction());
        System.out.println(Air.CooledDown(Shell) + constructionDot.buildConstruction());
        AirBalloon.setRotation(Rotation.DOWN);
        System.out.println(AirBalloon.StartedToFall() + constructionDot.buildConstruction());

        Fall fall = new Fall("Падение");
        fall.speed();

        System.out.println(StockOfBags.CameToTheEnd() + constructionDot.buildConstruction());

        FallTwo fallTwo = new FallTwo("Упал");
        fallTwo.falling();

        System.out.println(Falling.WasNotAbleToHold() + constructionDot.buildConstruction());
        System.out.println(Dunno.Grabbed(Collar) + constructionAnd.buildConstruction() + Dunno.PulledOut(OnePlace) + constructionDot.buildConstruction());

    }
}
