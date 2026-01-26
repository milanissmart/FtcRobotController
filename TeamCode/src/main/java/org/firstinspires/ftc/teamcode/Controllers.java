package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class Controllers extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double left_stick_y = -gamepad1.left_stick_y/2.0;
        double diff_x = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sum_trigger = gamepad1.left_trigger + gamepad1.right_trigger;
        telemetry.addData("left x",left_stick_y);
        telemetry.addData("left y",gamepad1.left_stick_y);
        telemetry.addData("is button a pressed",gamepad1.a);
        telemetry.addData("is button b pressed",gamepad1.b);
        telemetry.addData("right x",gamepad1.right_stick_x);
        telemetry.addData("right y",-gamepad1.right_stick_y/2.0);
        telemetry.addData("diff for x", diff_x);
        telemetry.addData("sum of triggers is", sum_trigger);
    }
}
