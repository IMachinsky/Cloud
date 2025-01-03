package biz.imi.core.controller;

import biz.imi.core.service.InfoServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(value = "/api/v1/apps",
        consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.ALL_VALUE},
        produces = MediaType.APPLICATION_JSON_VALUE)
public class ServerInfoController {

    @Autowired
    private InfoServerService infoServerService; 

    
    @GetMapping("/info")
    public ServerInfoDTO getServerInfo() {
       
        String appName = infoServerService.getApplicationName();
        String serverPort = infoServerService.getServerPort();

        
        return new ServerInfoDTO(appName, serverPort);
    }

    
        public record ServerInfoDTO(String applicationName, String serverPort) {

        
    }
}
