package biz.imi.core.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InfoServerService {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String serverPort;


    public String getApplicationName() {
        return applicationName;
    }

    public String getServerPort() {
        return serverPort;
    }
}
