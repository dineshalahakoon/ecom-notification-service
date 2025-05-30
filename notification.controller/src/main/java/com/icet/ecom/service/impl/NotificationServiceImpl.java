package com.icet.ecom.service.impl;

import com.icet.ecom.model.request.NotifationRequest;
import com.icet.ecom.service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationServiceImpl implements NotificationService {


    @Override
    public void sendSms(NotifationRequest request) {
        log.info("sms request resived|{}",request);
    }
}
