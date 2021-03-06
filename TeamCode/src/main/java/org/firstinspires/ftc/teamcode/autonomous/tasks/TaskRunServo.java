package org.firstinspires.ftc.teamcode.autonomous.tasks;

import com.qualcomm.robotcore.hardware.Servo;

/**
 * TaskRunServo - Drive a servo to a position
 */

public class TaskRunServo implements Task {

    private double pos;
    private Servo servo;

    public TaskRunServo(Servo servo, double pos) {
        this.pos = pos;
        this.servo = servo;
    }

    @Override
    public void runTask() throws InterruptedException {
        servo.setPosition(pos);
    }
}
