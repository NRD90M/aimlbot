/**
 * 
 */
package com.xiaoyan.chatbot.controller;

import com.xiaoyan.chatbot.service.BotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("bot")
public class BotController {

	@Autowired
	private BotService botService1;

	@PostMapping("/chat")
	public String getAnswer(@RequestParam String question){
		String response = botService1.response(question);
		return response;
	}

}
