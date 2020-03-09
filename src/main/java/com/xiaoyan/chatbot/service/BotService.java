package com.xiaoyan.chatbot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bitoflife.chatterbean.AliceBot;
import bitoflife.chatterbean.AliceBotMother;

@Service
public class BotService {

	@Autowired
	private BotFactory botFactory;


	//已废弃
//	private static AliceBotMother mother = null;
//	private static AliceBot bot = null;
//
//	public BotService() {
//		mother = new AliceBotMother();
//		mother.setUp();
//		try {
//			bot = mother.newInstance();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}

	/**
	 * 回复消息
	 * @param input
	 * @return
	 */
	public String response(String input) {
		return botFactory.getBot().respond(input);
	}

}
