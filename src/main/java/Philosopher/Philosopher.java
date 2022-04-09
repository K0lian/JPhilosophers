package Philosopher;

import javafx.scene.ParallelCamera;

import java.util.Date;

public class Philosopher implements Runnable{
    private Date date;
    private boolean isEating;
    private int position;
    private long lastEat;
    private int numEat;
    private Parser pars;
//    private Date justEat;
    public Philosopher(int numEachMustEat, int pos, Parser prs) {
        date = new Date();
        numEat = numEachMustEat;
        isEating = false;
        position = pos;
        lastEat = date.getTime();
        pars = prs;
//        System.out.println("Phil #"+pos);
    }

    public void run(){
        System.out.println("Pobochnii potok");
    }
}
