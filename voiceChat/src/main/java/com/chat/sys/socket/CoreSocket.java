package com.chat.sys.socket;

import com.chat.common.util.FileUtil;

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

    /**
     * 接收语音信息
     * @param data
     * @param session
     * @throws Exception
     */
    @OnMessage
    public void onMessage(String data, Session session) throws Exception {
        FileUtil.save(data);
        System.out.println(data);
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
