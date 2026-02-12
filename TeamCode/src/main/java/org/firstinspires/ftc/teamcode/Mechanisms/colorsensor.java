package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class colorsensor {
    NormalizedColorSensor colorSensor;

    public enum Detectedcolor {
        PURPLE,
        GREEN,
        UNKNOWN
    }
    public void init(HardwareMap hwMap){
        colorSensor = hwMap.get(NormalizedColorSensor.class,"colorsensor");
        colorSensor.setGain(4); // used to tweek value on color sensor.
    }
    public Detectedcolor getDetectedcolor(Telemetry telemetry){
        NormalizedRGBA colors = colorSensor.getNormalizedColors();
        float normRed, normGreen, normBlue;
        normRed = colors.red/colors.alpha;
        normGreen = colors.green/colors.alpha;
        normBlue = colors.blue/colors.alpha;
        telemetry.addData("blue", normBlue);
        telemetry.addData("green",normGreen);
        telemetry.addData("red",normRed);
        if (normRed>0.35 && normGreen<0.3 && normBlue<0.3){ // RANDOM
            return Detectedcolor.PURPLE;
        }
        else if (normRed>0.5 && normGreen>0.3 && normBlue<0.3){ // RANDOM
            return Detectedcolor.GREEN;
        }else {
            return Detectedcolor.UNKNOWN;
        }
    }
}
