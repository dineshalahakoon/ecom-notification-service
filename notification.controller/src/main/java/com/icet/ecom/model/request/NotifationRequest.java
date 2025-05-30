package com.icet.ecom.model.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NotifationRequest {


    private String mobilrNumber;
    private String emailAddress;
    private String message;
}
