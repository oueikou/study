package com.xiaoli.study.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringUtil {
	
	static Logger LOGGER = LoggerFactory.getLogger(StringUtil.class);
	String s1 = "";
	String s2 = "aaaaaaa";
			
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            if (i % 2 == 0)
                LOGGER.info("Hello {}", i);
            else
                LOGGER.info("I am on index {}", i);
    }
    

}
