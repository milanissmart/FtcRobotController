package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Mechanisms.Testbench;

@TeleOp
public class TouchSensortgetvalue extends OpMode {
    Testbench touchSenor = new Testbench();
    @Override
    public void init() {
        touchSenor.init(hardwareMap);
    }

    @Override
    public void loop() {
        String is_pressed = "not pressed";
        telemetry.addData("Touched",touchSenor.value());
        if (touchSenor.value()==true){
            is_pressed = "pressed";
        }
        telemetry.addData("touch Sensor is ",is_pressed);
    }
}
