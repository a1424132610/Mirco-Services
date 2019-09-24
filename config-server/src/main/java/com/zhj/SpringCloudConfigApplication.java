package com.zhj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigServer
@RestController
public class SpringCloudConfigApplication
{
    @Value("${server.port:0}")
    private Integer port;

    public static void main( String[] args )
    {
        SpringApplication.run(SpringCloudConfigApplication.class);
    }



    @RequestMapping("/info")
    public Integer getInfo(){

        return port;
    }

}
