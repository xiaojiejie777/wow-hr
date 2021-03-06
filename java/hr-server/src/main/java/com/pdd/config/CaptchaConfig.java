package com.pdd.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * 验证码配置类
 */
@Configuration
public class CaptchaConfig {

    @Bean
    public DefaultKaptcha defaultKaptcha(){
        //验证码生成器
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        //配置
        Properties properties = new Properties();
        //是否有边框
        properties.setProperty("kaptcha.border", "yes");
        //设置边框颜色
        properties.setProperty("kaptcha.border.color", "245,245,245");
        //验证码
        properties.setProperty("kaptcha.session.key", "code");
        //验证码文本字符颜色
        properties.setProperty("kaptcha.textproducer.font.color", "blue");
        //字体样式
        properties.setProperty("kaptcha.textproducer.font.names", "宋体,楷体,微软雅黑");
        //字体大小
        properties.setProperty("kaptcha.textproducer.font.size", "30");
        //字符长度
        properties.setProperty("kaptcha.textproducer.char.length", "4");
        //字符间隔
        properties.setProperty("kaptcha.textproducer.char.space","3");
        //验证码图片宽度
        properties.setProperty("kaptcha.image.width", "150");
        //验证码图片高度
        properties.setProperty("kaptcha.image.height", "40");

        Config config = new Config(properties);
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }
}
