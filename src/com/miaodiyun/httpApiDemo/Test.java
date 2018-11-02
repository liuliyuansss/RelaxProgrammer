package com.miaodiyun.httpApiDemo;

public class Test
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		         System.out.println("进入短信验证接口方法");
				 // 会员营销短信接口
			/* 	 AffMarkSMS.execute();

				 // 语音验证码
				 VoiceCode.execute();*/
		            int ran=(int)(Math.random()*9000)+1000;
		            System.out.println("生成的四位随机数是："+ran);
		            int random=(int) ran;
		           // String randoms= random;
		            String randoms=String.valueOf(random);
		         // 获取开发者账号信息
	            	AccountInfo.execute();
	            	IndustrySMS.smsContent.replace("{1}",randoms);
		         // 验证码通知短信接口
		            IndustrySMS.execute();

	}
}
