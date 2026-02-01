package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class robotangle extends OpMode {
    Robot robot = new Robot(9);


    @Override
    public void init() {

    }

    @Override
    public void loop() {
        robot.setX(0);
        robot.getangle(0);
        if (gamepad1.dpad_down){
            robot.changex(-0.1);
        }
        if (gamepad1.dpad_up){
            robot.changex(0.1);
        }
        if (gamepad1.a){
            robot.turnrobot(-0.1);
        }
        if (gamepad1.b){
        robot.turnrobot(0.1);

        telemetry.addData("angle", robot.getHeading());
        telemetry.addData("x",robot.getX());
        }
    }
}
