package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Mechanisms.colorsensor;

@TeleOp
public class colorsensoropmode extends OpMode {
    colorsensor colorsensor = new colorsensor();
    colorsensor.Detectedcolor color;
    @Override
    public void init() {
        colorsensor.init(hardwareMap);
    }

    @Override
    public void loop() {
        colorsensor.getDetectedcolor(telemetry);
        telemetry.addData("color",color);
    }
}
