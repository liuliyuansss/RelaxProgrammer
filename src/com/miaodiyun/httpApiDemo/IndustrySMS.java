package com.miaodiyun.httpApiDemo;

import java.net.URLEncoder;

import com.miaodiyun.httpApiDemo.common.Config;
import com.miaodiyun.httpApiDemo.common.HttpUtil;

/**
 * 验证码通知短信接口
 *
 * @ClassName: IndustrySMS
 * @Description: 验证码通知短信接口
 *
 */
public class IndustrySMS
{
	private static String operation = "/industrySMS/sendSMS";

	private static String accountSid = Config.ACCOUNT_SID;
	private static String to = "17694475504";
	int ran=(int)(Math.random()*9000)+1000;
	int random=(int) ran;
	public static String smsContent = "【棉花糖科技】棉花糖科技，您已成功注册成为棉花糖高级会员，您的验证码位{1},如非本人操作，请忽略此短信。";

	/**
	 * 验证码通知短信
	 */
	public static void execute()
	{
		String tmpSmsContent = null;
		try{
			tmpSmsContent = URLEncoder.encode(smsContent, "UTF-8");
		}catch(Exception e){

		}
		String url = Config.BASE_URL + operation;
		String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + tmpSmsContent
				+ HttpUtil.createCommonParam();

		// 提交请求
		String result = HttpUtil.post(url, body);
		System.out.println("result:" + System.lineSeparator() + result);
	}
}
