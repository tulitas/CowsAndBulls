package cab;

import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;

import java.util.Random;
import java.util.Scanner;

public class MainController {


    private int turnNr;
    public Spinner<Integer> num1;
    public Spinner<Integer> num2;
    public Spinner<Integer> num3;
    public Spinner<Integer> num4;

    public TableView<Turn> turns;
    static Random rand = new Random();

    public void initialize() {
        System.out.println("Hello!");
    }


    //generiruet slu4ainoe 4islo

    String t1 = String.valueOf(rand.nextInt(10) + 1);
    String t2 = String.valueOf(rand.nextInt(10) + 1);
    String t3 = String.valueOf(rand.nextInt(10) + 1);
    String t4 = String.valueOf(rand.nextInt(10) + 1);




    String myNum = t1 + t2 + t3 + t4;


    public void go() {

        turnNr++;
        int n1 = num1.getValue();
        int n2 = num2.getValue();
        int n3 = num3.getValue();
        int n4 = num4.getValue();

//perevodim vvedjonnoe 4islo v strokovuju peremennuju
//        String s1 = String.valueOf(rand.nextInt(n1));
//        String s2 = String.valueOf(rand.nextInt(n2));
//        String s3 = String.valueOf(rand.nextInt(n3));
//        String s4 = String.valueOf(rand.nextInt(n4));



        System.out.println("" + n1 + n2 + n3 + n4);

        Turn turn = new Turn();
        turn.setGuess("" + n1 + n2 + n3 + n4);
        turn.setTurnNr(turnNr);



        turn.setBulls(n1);
        turn.setCows(10);
        turns.getItems().add(turn);
        turn.setMyNum(Integer.parseInt(myNum));


    }
}
