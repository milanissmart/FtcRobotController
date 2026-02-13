package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class drive {
    private DcMotor backleft, backright, frontright, frontleft;

    public void init(HardwareMap hwMap){
        backleft = hwMap.get(DcMotor.class,"bl");
        backright = hwMap.get(DcMotor.class,"br");
        frontleft = hwMap.get(DcMotor.class,"fl");
        frontright = hwMap.get(DcMotor.class,"fr");

        backright.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backleft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontleft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontright.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        frontleft.setDirection(DcMotorSimple.Direction.REVERSE);
        backleft.setDirection(DcMotorSimple.Direction.REVERSE);
    }
    public void drive(double throttle, double spin){
        double leftpower = throttle + spin;
        double rightpower = throttle - spin;
        double largest = Math.max(Math.abs(leftpower),Math.abs(rightpower));
        if (largest>1){
            leftpower /=largest;
            rightpower /= largest;
        }

        backleft.setPower(leftpower);
        frontleft.setPower(leftpower);
        backright.setPower(rightpower);
        frontright.setPower(rightpower);
    }
}
