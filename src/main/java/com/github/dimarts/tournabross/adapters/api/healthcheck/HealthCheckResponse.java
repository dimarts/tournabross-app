package com.github.dimarts.tournabross.adapters.api.healthcheck;

public interface HealthCheckResponse {
    String getName();

    String getStatus();

    static HealthCheckResponse getInstance() {
        return new HealthCheckResponse() {
            @Override
            public String getName() {
                return "tournamentbross-api";
            }

            @Override
            public String getStatus() {
                return "ok";
            }
        };
    }
}
