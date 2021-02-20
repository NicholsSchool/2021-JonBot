package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class TalonSubsystem extends SubsystemBase {

    private WPI_TalonSRX talon;

    public TalonSubsystem() {

        talon = new WPI_TalonSRX(RobotMap.TALON_ID);
    }

    @Override
    public void periodic() {

        // This method will be called once per scheduler run
    }

    public void setSpeed(double speed) {

        talon.set(speed);
    }

    public void stop() {

        talon.stopMotor();
    }
}
