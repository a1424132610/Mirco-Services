package com.zhj;


import java.io.*;

/**
 * Hello world!
 */
public class SpringEurekaApplication {

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\14241\\Desktop\\扩展知识点.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
        StringBuffer buffer = new StringBuffer();
        while (br.ready()) {
            buffer.append(br.readLine());
        }
        System.out.println(buffer.toString());
    }

}
