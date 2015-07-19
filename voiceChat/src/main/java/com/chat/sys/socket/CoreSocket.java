package com.chat.sys.socket;

import java.util.HashMap;
import java.util.Map;

import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/coreSocket")
public class CoreSocket {
	private static Map<String, Session> map = new HashMap<String, Session>();

	@OnMessage
	public void onMessage(String message, Session session) throws Exception {
		String[] user = message.split(":");
		String token = user[0];
		if(token.equals("user")){
			CoreSocket.map.put(user[1], session);
		}else{
			CoreSocket.map.get(token).getBasicRemote().sendText(user[1]);
		}
	}

	@OnOpen
	public void onOpen(Session session) {
		System.out.println("WebSocket opened: " + session.getId());
	}

	@OnClose
	public void onClose(CloseReason reason) {
		System.out.println("Closing a WebSocket due to "
				+ reason.getReasonPhrase());
	}

}
