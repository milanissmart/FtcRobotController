package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp
public class Ifpractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double Lefty = gamepad1.left_stick_y;

        if (Lefty<0.1 && Lefty>-0.1){
            telemetry.addData("left sick is in the", "DEADZONE");
        }
        telemetry.addData("left y", gamepad1.left_stick_y);

        if (!gamepad1.a){
            Lefty = Lefty*0.5;
            telemetry.addData("left y", Lefty);
        }
        else {
            Lefty=Lefty;
            telemetry.addData("left y ", Lefty);
        }
    }
    /*
    || or
    && and
    ! not
     */
}
