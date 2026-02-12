package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Mechanisms.Testbench;
import org.firstinspires.ftc.teamcode.Mechanisms.imu;

@TeleOp
public class imu_heading extends OpMode {
    imu imu = new imu();
    Testbench testbench = new Testbench();
    
    double heading = imu.heading();
    @Override
    public void init() {
        imu.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (heading<0.5&&heading>-0.5){
            testbench.speed(0);
        } else if (heading<-0.5) {
            testbench.speed(1);
            
        } else if (heading>0.5) {
            testbench.speed(-1);
        }
        telemetry.addData("heading",imu.heading());
    }
}
