package com.leean.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
* web项目配置类
* 本地资源映射
*
* */
@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("处理映射文件...");

        registry.addResourceHandler("/image/swiper/**")
                .addResourceLocations("file:E:\\Project\\JavaProjects\\mall_imgs\\swiperImgs\\");

        registry.addResourceHandler("/image/bittype/**")
                .addResourceLocations("file:E:\\Project\\JavaProjects\\mall_imgs\\bigTypeImgs\\");
        // E:\Project\JavaProjects\mall_imgs\productImgs

        registry.addResourceHandler("/image/product/**")
                .addResourceLocations("file:E:\\Project\\JavaProjects\\mall_imgs\\productImgs\\");
        registry.addResourceHandler("/image/productSwiperImgs/**")
                .addResourceLocations("file:E:\\Project\\JavaProjects\\mall_imgs\\productSwiperImgs\\");

        registry.addResourceHandler("/image/productIntroImgs/**")
                .addResourceLocations("file:E:\\Project\\JavaProjects\\mall_imgs\\productSwiperImgs\\");
        registry.addResourceHandler("/image/productParaImgs/**")
                .addResourceLocations("file:E:\\Project\\JavaProjects\\mall_imgs\\productSwiperImgs\\");

    }
}
