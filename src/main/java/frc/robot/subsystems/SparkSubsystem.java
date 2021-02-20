package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class SparkSubsystem extends SubsystemBase {

    private CANSparkMax spark;

    public SparkSubsystem() {

        spark = new CANSparkMax(RobotMap.SPARK_ID, MotorType.kBrushless);
    }

    @Override
    public void periodic() {

        // This method will be called once per scheduler run
    }

    public void setSpeed(double speed) {

        spark.set(speed);
    }

    public void stop() {

        spark.stopMotor();
    }
}
