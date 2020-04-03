package com.github.dimarts.tournabross.adapters.api.healthcheck;

import com.github.dimarts.tournabross.adapters.api.BaseApplicationTest;
import org.junit.jupiter.api.Test;

public class HealthCheckControllerTest extends BaseApplicationTest {

    @Test
    public void check_api_status_ok() throws Exception {
        assertResponse("/health-check", 200, "{\"name\": \"tournamentbross-api\", \"status\": \"ok\"}");
    }

}
