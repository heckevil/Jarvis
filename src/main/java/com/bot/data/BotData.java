package com.bot.data;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Data
@ConfigurationProperties("spring.application")
public class BotData {

    private String name;

}
