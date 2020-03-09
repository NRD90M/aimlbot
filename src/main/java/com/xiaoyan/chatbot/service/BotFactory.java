package com.xiaoyan.chatbot.service;

import bitoflife.chatterbean.AliceBot;
import bitoflife.chatterbean.AliceBotMother;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BotFactory {

    private static final AliceBotMother factory = new AliceBotMother();

    @Bean
    public AliceBot getBot(){
        try {
            return factory.newInstance();
        } catch (Exception e) {
            System.out.println("get bot falled");
        }
        return null;
    }

}
