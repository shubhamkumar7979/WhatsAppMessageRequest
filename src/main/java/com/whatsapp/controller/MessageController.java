package com.whatsapp.controller;

import com.whatsapp.emtity.WhatsAppMessageRequest;
import com.whatsapp.service.TwilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    private final TwilioService twilioService;

    @Autowired
    public MessageController(TwilioService twilioService) {
        this.twilioService = twilioService;
    }

    @PostMapping("/send-whatsapp")
    public void sendWhatsAppMessage(@RequestBody WhatsAppMessageRequest request) {
        twilioService.sendWhatsAppMessage(request.getTo(), request.getMessage());
    }
}
