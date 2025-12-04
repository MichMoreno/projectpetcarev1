package com.projectframe.mx.petcare.dominio.service;

public interface EmailService {
    public void sendEmail(String to, String subject, String content);
}
