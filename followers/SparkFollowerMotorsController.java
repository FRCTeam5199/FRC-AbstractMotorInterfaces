package frc.robot.abstractmotorinterfaces.followers;

import frc.robot.abstractmotorinterfaces.AbstractMotorController;
import frc.robot.abstractmotorinterfaces.SparkMotorController;

/**
 * This works to wrap Neo's and maybe some other motors
 */
public class SparkFollowerMotorsController extends AbstractFollowerMotorController {
    public SparkFollowerMotorsController(int... ids) {
        motors = new AbstractMotorController[ids.length];
        for (int i = 0; i < ids.length; i++)
            motors[i] = new SparkMotorController(ids[i]);
    }

    @Override
    public void invert(boolean invert) {
        for (AbstractMotorController motor : motors)
            motor.setInverted(invert);
    }
}
