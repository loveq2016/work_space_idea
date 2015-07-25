package com.chat.common.util;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 文件基类
 * Created by Administrator on 2015/7/25.
 */
public class FileUtil {
    // 保存上传文件
    public static void save(String data){
        DateFormat format=new SimpleDateFormat("yyyyMMddHHmm");
        // 截取文件类型
        String suffix = data.substring(data.indexOf('/')+1,data.indexOf(';'));
        String fileName = format.format(new Date()) +'.'+ suffix;
        String filePath = "file\\"+suffix;
        // 执行base64解码
        int index = data.indexOf(',');
        byte[] fileByte = Base64Util.decode(data.substring(index + 1));
        InputStream in = null;
        try {
            in = StreamUtils.byteTOInputStream(fileByte);
        } catch (Exception e) {
            e.printStackTrace();
        }

        File f = new File(filePath, fileName);
        if (!f.getParentFile().exists()) { // 如果该文件路径不存在就创建该路径
            f.getParentFile().mkdirs();
        }
        if (!f.exists()) { // 指定路径下的filename.txt文件要是不存在就创建
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 写入文件
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] b = new byte[1024];
        int n = 0;
        try {
            while ((n = in.read(b)) != -1) {
                fos.write(b, 0, n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fos.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(fileName + "保存成功。");
    }
}
