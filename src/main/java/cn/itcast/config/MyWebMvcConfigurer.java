package cn.itcast.config;

import cn.itcast.interceptor.Myinterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @创建人 xgh
 * @创建时间 2019/8/1611:52
 * @描述
 */
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new Myinterceptor()).addPathPatterns("/user/**");
    }
}
