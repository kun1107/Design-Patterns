package StrategyPattern.with;

import StrategyPattern.with.strategy.DriveStrategy;
import StrategyPattern.with.strategy.NormalDrive;

public class GoodsVehical extends Vehical{

    public GoodsVehical() {
        super(new NormalDrive());
    }
}
