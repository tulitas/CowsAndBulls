package cab;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Turn {
    private IntegerProperty turnNr
            = new SimpleIntegerProperty();
    private StringProperty guess
            = new SimpleStringProperty();
    private IntegerProperty bulls
            = new SimpleIntegerProperty();
    private IntegerProperty cows
            = new SimpleIntegerProperty();
    private IntegerProperty myNum
            = new SimpleIntegerProperty();


    public int getTurnNr() {
        return turnNr.get();
    }

    public IntegerProperty turnNrProperty() {
        return turnNr;
    }

    public void setTurnNr(int turnNr) {
        this.turnNr.set(turnNr);
    }

    public String getGuess() {
        return guess.get();
    }

    public StringProperty guessProperty() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess.set(guess);
    }

    public int getBulls() {
        return bulls.get();
    }

    public IntegerProperty bullsProperty() {
        return bulls;
    }

    public void setBulls(int bulls) {
        this.bulls.set(bulls);
    }

    public int getCows() {
        return cows.get();
    }

    public IntegerProperty cowsProperty() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows.set(cows);
    }

    public int getMyNum() {
        return myNum.get();
    }

    public IntegerProperty myNumProperty() {
        return myNum;
    }

    public void setMyNum(int myNum) {
        this.myNum.set(myNum);
    }
}
