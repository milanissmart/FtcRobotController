package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Mechanisms.Distancesensor;
import org.firstinspires.ftc.teamcode.Mechanisms.Testbench;

@TeleOp
@Disabled
public class Testingdistancesensoranddcmotor extends OpMode {

    Distancesensor distancesensor = new Distancesensor();
    @Override
    public void init() {
        distancesensor.init(hardwareMap);
    }

    @Override
    public void loop() {
        double motorspeed = distancesensor.distance()/5;
        distancesensor.motorspeed(motorspeed);
        if (motorspeed>1){
            motorspeed = 1;
        } else if (motorspeed<0) {
            motorspeed = 0;
        }
        telemetry.addData("distance",distancesensor.distance());
        telemetry.addData("distance modify or motorspeed",distancesensor.distance()/5);
        telemetry.addData("what is the motor speed", motorspeed);
        

    }

}
