package com.whatsapp.emtity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "whatsAppMessageRequest")

public class WhatsAppMessageRequest {

    private String to;
    private String message;

    // Add getters and setters
}

