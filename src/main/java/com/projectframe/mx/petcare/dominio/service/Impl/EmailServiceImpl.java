package com.projectframe.mx.petcare.dominio.service.Impl;

import com.projectframe.mx.petcare.dominio.service.EmailService;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;




import org.springframework.beans.factory.annotation.Value;



import org.springframework.core.io.Resource;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendEmail(String to, String subject, String content){
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper;
        try{
            helper = new MimeMessageHelper(message, true, "UTF-8");
            helper.setFrom(new InternetAddress("nonreply@petcare.com", "Petcare"));
            helper.setSubject(subject);
            helper.setText(content, true);
            helper.setTo(to);
            mailSender.send(message);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
