import com.ctre.phoenix6.sim.TalonFXSimState.MotorType;
import com.revrobotics.spark.ClosedLoopSlot;
import com.revrobotics.spark.SparkMax;

public class BasicSparkSubsystem {
    private final int sparkID = 0;
    private final boolean inverted = false;
    private final int currentLimit = 60;

    private final double slot0kP = 0.1;
    private final double slot0kI = 0.0;
    private final double slot0kD = 0.0;

    private final double slot0kS = 0.1;

    private final double slot1kP = 0.1;
    private final double slot1kI = 0.0;
    private final double slot1kD = 0.0;

    private final double slot1kS = 0.1;
    private final double slot1kV = 0.1;

    private SparkMax motor;
    private SparkMaxConfig config;

    private SparkClosedLoopController controller;
    private ClosedLoopSlot closedLoopSlot = ClosedLoopSlot.kSlot0;

    private boolean isBrakeMode = true;

    public BasicSparkSubsystem() {
        motor = new SparkMax(sparkId, MotorType,kBrushless);

        controller = motor.getClosedLoopController();

        //General Config
    }

}