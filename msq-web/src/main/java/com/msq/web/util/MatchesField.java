package com.msq.web.util;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.*;

/**
 * @author: create by qiuan
 * @version: v1.0
 * @description: com.msq.web.util
 * @date:2019/1/28
 */
public class MatchesField {
/*    public static void main(String args[]) {

        String m = queryFieldList("select * from h_web_user where account = [h_web_ser.account] and  ");
        System.out.println(m);
    }*/

    /**
     * 获取参数变量
     * @param sql
     * @return String 参数字符串
     */
    public static String queryFieldList(String sql){
       StringBuffer str = new StringBuffer();
        Pattern pattern = Pattern.compile("(?<=\\[)(.+?)(?=\\])");
        Matcher matcher = pattern.matcher(sql);
        while(matcher.find()){
            String tmp= matcher.group();
            str.append(tmp).append(",");
        }
        return str.toString().substring(0,str.length()-1);
    }
}
