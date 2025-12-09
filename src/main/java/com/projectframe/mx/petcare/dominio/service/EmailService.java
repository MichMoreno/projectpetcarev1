package com.projectframe.mx.petcare.dominio.service;

public interface EmailService {
    public void sendEmail(String to, String subject, String content);
    public void sendEmailWithAttachment(String to, String subject, String content, byte[] attachment, String filename);
}
