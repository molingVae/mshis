package com.mshis.medicalSystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
@Slf4j
//@EnableCaching
public class MedicalSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalSystemApplication.class, args);
        log.info("访问http://localhost:8081即可查看后端API文档");
    }

    @GetMapping("/")
    public String index() {
        return "redirect:swagger-ui.html";
    }
}
