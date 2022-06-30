package example.autoconfigure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import example.boot.actuator.MaintenanceModeHealthIndicator;

@Configuration
public class MaintenanceModeAutoConfiguration {
    @Bean
    MaintenanceModeHealthIndicator getMaintenandceModeHealthIndicator() {
        return new MaintenanceModeHealthIndicator();
    }
}