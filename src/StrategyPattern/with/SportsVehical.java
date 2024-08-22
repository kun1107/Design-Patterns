package StrategyPattern.with;

import StrategyPattern.with.strategy.DriveStrategy;
import StrategyPattern.with.strategy.SportsDrive;

public class SportsVehical extends Vehical{

    public SportsVehical() {
        super(new SportsDrive());
    }
}
