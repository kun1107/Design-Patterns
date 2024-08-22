package StrategyPattern.with.strategy;

import StrategyPattern.with.Vehical;

public class SUVehical extends Vehical {

    public SUVehical() {
        super(new SportsDrive());
    }
}
