package StrategyPattern.with;

import StrategyPattern.with.strategy.SportsDrive;

public class WithStrategyPatternMain {
    public static void main(String[] args) {

        Vehical vehical = new GoodsVehical();
        vehical.drive();
    }
}
