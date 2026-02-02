package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Testbench {
    // Touch Sensor
    private DigitalChannel touchSensor;
    //DC Motor
    private DcMotor dcMotor;
    private double getTicksPerRev;

    public void init(HardwareMap hwMap){
        // Touch sensor
            touchSensor = hwMap.get(DigitalChannel.class,"touchsensor");
            touchSensor.setMode(DigitalChannel.Mode.INPUT);
        //DC Motor
            dcMotor = hwMap.get(DcMotor.class,"dcmotor");
            dcMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            getTicksPerRev = dcMotor.getMotorType().getTicksPerRev();
            dcMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
//-----------------Touch Sensor-----------------
    public boolean value(){
        return !touchSensor.getState();
    }
    public boolean notpressedvalue(){
        return touchSensor.getState();
    }
// ----------------DC Motor--------------------

    public void speed(double speed){
         dcMotor.setPower(speed);
    }

    public double setGetTicksPerRev(){
        return dcMotor.getCurrentPosition()/getTicksPerRev;
    }
    public void zero(){
        dcMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public void notzero(){
        dcMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }
}
