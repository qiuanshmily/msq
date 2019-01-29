package com.msq.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Const {
	
	public static int HTTP_STATUS_SUCESS = 200;

	public static String PASSWORD_KEY = "@#$%^&*()OPG#$%^&*(HG";

	public static String DES3_KEY = "9964DYByKL967c3308imytCB";

	public static int COOKIE_TIMEOUT= 30*24*60*60;

	
	
}
