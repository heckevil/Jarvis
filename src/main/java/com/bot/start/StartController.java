package com.bot.start;

import com.example.demo.DemoApplication;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.security.auth.login.LoginException;

@Component
public class StartController {

    @Value("${discord.Bot.Token}")
    String token;

    public static void main(String[] args) throws LoginException {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println(token);

    }
}
