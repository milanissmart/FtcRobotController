package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Methods extends OpMode {

    @Override
    public void init() {

    }

    public double square(double input) {
        double Output = input * input;
        if (input < 0) {
            Output = -Output;
        }
        return Output;
    }

    @Override
    public void loop() {
        double x = gamepad1.left_stick_x;
        telemetry.addData("normal x", x);
        x = square(x);
        telemetry.addData("moded x", x);

    }
}
