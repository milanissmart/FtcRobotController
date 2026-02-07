package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class Distancesensor {
    private DistanceSensor distanceSensor;
    private DcMotor dcMotor;
    public void init(HardwareMap hwMap){
        distanceSensor = hwMap.get(DistanceSensor.class,"distancesensor");
        dcMotor =hwMap.get(DcMotor.class,"dcmotor");

    }
    public void motorspeed(double speed){
        dcMotor.setPower(speed);
    }
    public double distance(){
        return distanceSensor.getDistance(DistanceUnit.INCH);
    }
}
