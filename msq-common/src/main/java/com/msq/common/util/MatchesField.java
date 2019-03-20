package com.msq.common.util;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: create by qiuan
 * @version: v1.0
 * @description: com.msq.web.util
 * @date:2019/1/28
 */
public class MatchesField {
   public static void main(String args[]) {

        String m = queryFieldList("select * from h_web_user where account = [h_web_user.account] and  id = [h_web_user.id] ");
        System.out.println(m);
    }

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
        System.out.println(str);
        return str.toString().substring(0,str.length()-1);
    }

    /**
     * SQL验证
     * @param oldSql
     * @return true 为验证成功
     */
    public static  boolean checkSQL(String oldSql){
        //sql = "select * from h_web_user where account = [h_web_user.account] and  id = [h_web_user.id]";
        Pattern pattern = Pattern.compile("(?<=\\[)(.+?)(?=\\])");
        Matcher matcher = pattern.matcher(oldSql);
        String newSql = matcher.replaceAll("1").replace("[","").
                replace("]","");
        System.out.println(newSql);
        return  false;
    }
}
