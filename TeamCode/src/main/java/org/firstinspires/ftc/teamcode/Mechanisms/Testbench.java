package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Testbench {
    private DigitalChannel touchSensor;

    public void init(HardwareMap hwMap){
            touchSensor = hwMap.get(DigitalChannel.class,"touchsensor");
            touchSensor.setMode(DigitalChannel.Mode.INPUT);

    }

    public boolean value(){
        return !touchSensor.getState();
    }
    public boolean notpressedvalue(){
        return touchSensor.getState();
    }
}
