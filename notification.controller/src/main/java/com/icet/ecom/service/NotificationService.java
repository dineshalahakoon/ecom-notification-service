package com.icet.ecom.service;

import com.icet.ecom.model.request.NotifationRequest;

public interface NotificationService {
    void sendSms(NotifationRequest request);
}
