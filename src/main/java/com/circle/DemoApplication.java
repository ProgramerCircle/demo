package com.circle;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@MapperScan("com.circle.**.mapper")
@Slf4j
public class DemoApplication {
    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        Environment env = app.run(args).getEnvironment();
        log.info("Access URLs:\n {} Local: \t\thttp://127.0.0.1:{}\n\tExternal: \thttp://{}:{}\n{}",
                "----------------------------------------------------------\n\t",
                env.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"),
                "----------------------------------------------------------");
    }
}
