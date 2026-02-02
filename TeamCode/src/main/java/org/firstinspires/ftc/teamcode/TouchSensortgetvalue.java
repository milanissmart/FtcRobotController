package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Mechanisms.Testbench;

@TeleOp
public class TouchSensortgetvalue extends OpMode {
    Testbench testbench = new Testbench();
    @Override
    public void init() {
        testbench.init(hardwareMap);

    }

    @Override
    public void loop() {
        String is_pressed = "not pressed";
        telemetry.addData("Touched", testbench.value());
        if (gamepad1.a){
            testbench.zero();
        } else if (gamepad1.b) {
            testbench.notzero();
        }
         double motorspeed = testbench.speed(testbench.distance()/5);
        if (motorspeed>1){
            motorspeed = 1;
        } else if (motorspeed<0) {
            motorspeed = 0;
        }
        telemetry.addData("touch Sensor is ",is_pressed);
        telemetry.addData("distance",testbench.distance());
    }
}
