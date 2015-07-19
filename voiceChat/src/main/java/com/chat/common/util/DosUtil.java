package com.chat.common.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * dos命令工具类
 *
 * @author xumingfeng
 *
 */
public class DosUtil {
	/**
	 * 执行dos命令
	 * @param command 命令
	 * @return String 回调信息
	 * @throws Exception
	 */
	public String executeCommand(String command) throws Exception {
		// 执行ping命令
		Process process = Runtime.getRuntime().exec(command);
		// 记录dos命令的返回信息
		StringBuffer resStr = new StringBuffer();
		// 获取返回信息的流
		InputStream in = process.getInputStream();
		Reader reader = new InputStreamReader(in);
		BufferedReader bReader = new BufferedReader(reader);
		for (String res = ""; (res = bReader.readLine()) != null;) {
			resStr.append(res + "\n");
		}
		bReader.close();
		reader.close();
		process.waitFor();
		return resStr.toString();
	}
	/**
	 * 執行bat文件
	 * @param path bat文件路径
	 * @return String 回调信息
	 * @throws Exception
	 */
	public String executeCommands(String path) throws Exception {
		String line;
		Process process = Runtime.getRuntime().exec(path);
		// 记录dos命令的返回信息
		StringBuffer resStr = new StringBuffer();
		// 获取返回信息的流
		InputStream in = process.getInputStream();
		Reader reader = new InputStreamReader(in);
		BufferedReader bReader = new BufferedReader(reader);
		for (String res = ""; (res = bReader.readLine()) != null;) {
			resStr.append(res + "\n");
		}
		bReader.close();
		reader.close();
		process.waitFor();
		return resStr.toString();
	}
}
