package com.infy.app.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class OTPUtility 
{
		private Logger logger = LoggerFactory.getLogger(this.getClass());
		public Integer sendOTP()
		{
			logger.info("Inside SendOTP() method of {}", this.getClass());
			return 123456;
		}

}
