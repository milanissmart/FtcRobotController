package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Mechanisms.drive;

@TeleOp
public class drivingtherobot extends OpMode {
        drive drive = new drive();

        double throttle = -gamepad1.left_stick_y;
        double spin = gamepad1.left_stick_x;
    @Override
    public void init() {
        drive.init(hardwareMap);
    }

    @Override
    public void loop() {
        drive.drive(throttle,spin);
    }
}
