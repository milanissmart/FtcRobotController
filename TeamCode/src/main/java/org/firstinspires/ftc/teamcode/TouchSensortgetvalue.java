package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Mechanisms.Testbench;

@TeleOp
public class TouchSensortgetvalue extends OpMode {
    Testbench testbench = new Testbench();
    double right,left;
    @Override
    public void init() {
        testbench.init(hardwareMap);
        right = 0;
        left = 0;
    }

    @Override
    public void loop() {
        String is_pressed = "not pressed";
        right = gamepad1.right_trigger;
        left = gamepad1.left_trigger;
        telemetry.addData("Touched", testbench.value());
        testbench.gotoservopos(right);
        testbench.move(left);
         double motorspeed = testbench.distance()/5;
         testbench.speed(motorspeed);
        if (motorspeed>1){
            motorspeed = 1;
        } else if (motorspeed<0) {
            motorspeed = 0;
        }
        telemetry.addData("touch Sensor is ",is_pressed);
        telemetry.addData("distance",testbench.distance());
        telemetry.addData("motor speed",motorspeed);
    }
}
