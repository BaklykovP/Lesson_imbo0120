package ru.mirea.exercise15_16.section1;

public class StepByStepThread implements Runnable {
    boolean t = false; // левая нога первая
    Robot robot;

    StepByStepThread(Robot res) {
        this.robot = res;
    }

    @Override
    public void run() {
        while(robot.getLifeTime() > 0){
            if(t)
                robot.rightStep();
            else
                robot.leftStep();

            changeOfCondition();
        }
    }

    private void changeOfCondition() {
        if (t == false)
            t = true;
        else
            t = false;
    }
}
