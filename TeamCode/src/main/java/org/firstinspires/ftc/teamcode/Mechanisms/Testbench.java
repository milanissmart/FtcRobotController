package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class Testbench {
    // Touch Sensor
    private DigitalChannel touchSensor;
    //DC Motor
    private DcMotor dcMotor;
    private double getTicksPerRev;
    // Distance sensor
    private DistanceSensor distanceSensor;
    // Servo
    private Servo servo;
    private CRServo crServo;

    public void init(HardwareMap hwMap){
        // Touch sensor
            touchSensor = hwMap.get(DigitalChannel.class,"touchsensor");
            touchSensor.setMode(DigitalChannel.Mode.INPUT);
        //DC Motor
            dcMotor = hwMap.get(DcMotor.class,"dcmotor");
            dcMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            getTicksPerRev = dcMotor.getMotorType().getTicksPerRev();
            dcMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        // Distance Sensor
            distanceSensor = hwMap.get(DistanceSensor.class,"distance");
        // Servo
            servo = hwMap.get(Servo.class,"sevro");
            crServo = hwMap.get(CRServo.class,"CR_Servo");
            servo.scaleRange(0,1);
            crServo.setDirection(DcMotorSimple.Direction.REVERSE);
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
//---------------Distance Sensor-------------
    public double distance(){
        return distanceSensor.getDistance(DistanceUnit.INCH);
    }
//-------------------Servo------------------------
    public void gotoservopos(double pos){
        servo.setPosition(pos);
    }
    public void move(double power){
        crServo.setPower(power);
    }
}
