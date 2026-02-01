package org.firstinspires.ftc.teamcode;

public class Robot {

    double classangle;
    double x;

    public Robot(double inputangle){
        this.classangle = inputangle;
    }

    public double getX(){
            double x = this.x;


            return x;

    }

    public void setX(double angle){
        this.x = x;

    }

    public void changex(double xchange){
        x += xchange;
    }


    public double getHeading(){
        double angle = this.classangle;

        if (angle>180){
            angle -= 360;
        }
        if (angle<-180){
            angle +=360;
        }

        return angle;

    }

    public void getangle(double angle){
        this.classangle = angle;

    }

    public void turnrobot(double anglechang){
        classangle += anglechang;
    }


}
