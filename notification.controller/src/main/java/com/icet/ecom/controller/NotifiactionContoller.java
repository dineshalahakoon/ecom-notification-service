package com.icet.ecom.controller;

import com.icet.ecom.model.request.NotifationRequest;
import com.icet.ecom.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notification")
@RequiredArgsConstructor
public class NotifiactionContoller {


private final NotificationService notificationService;

    @PostMapping("/send")
    void sendInvoiceNotification(@RequestBody NotifationRequest request){
        notificationService.sendSms(request);
    }


}
