package StrategyPattern.with;

import StrategyPattern.with.strategy.DriveStrategy;

public class Vehical {
    DriveStrategy driveStrategy;

    public Vehical(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
