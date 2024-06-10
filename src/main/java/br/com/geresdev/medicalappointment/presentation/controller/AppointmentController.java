package br.com.geresdev.medicalappointment.presentation.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    private static final String HELLO_WORLD = "Hello World";
    //    private final AppointmentService appointmentService;

    @GetMapping
    public ResponseEntity<String> getTest(HttpServletRequest request){
        String helloWorldIP = "%s from %s".formatted(HELLO_WORLD, request.getRemoteAddr());
        log.info(helloWorldIP);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("GeresDev-Example-Header",
                "Value-ResponseEntityBuilderWithHttpHeaders");

        return ResponseEntity.ok()
                .headers(responseHeaders)
                .body(helloWorldIP);
    }
}
