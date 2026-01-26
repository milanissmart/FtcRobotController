package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
@Disabled
public class Variables extends OpMode {
    @Override
    public void init() {
        int MotorAngle = 67;
        int TeamNumber = 15337;
        double motorSpeed = 0.77;
        boolean clawOn = true;
        String name = "alpha smarts";

        telemetry.addData("Team Number",TeamNumber);
        telemetry.addData("motor speed",motorSpeed);
        telemetry.addData("claw closed",clawOn);
        telemetry.addData("Team name",name);
        telemetry.addData("Motor Angle",MotorAngle);

    }

    @Override
    public void loop() {

    }
}
