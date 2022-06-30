package example.boot.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class MaintenanceModeHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        // TODO Auto-generated method stub
        return null;
    }

}