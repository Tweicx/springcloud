package com.oxbridge.dashboardturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 监控中心
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class DashboardTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashboardTurbineApplication.class, args);
    }
}
