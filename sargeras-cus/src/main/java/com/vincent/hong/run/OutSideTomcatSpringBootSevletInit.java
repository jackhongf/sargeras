/**
 * Copyright (C), 2018-2019, from  vincent hong
 * FileName: SpringBootOutSideTomcatInit
 * Author:   vincent hong
 * Date:     2019/3/15 23:42
 * Description: 非内置tomcat的SpringBoot容器初始化
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.vincent.hong.run;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 *
 * 〈非内置tomcat的SpringBoot容器Sevlet初始化〉
 *
 * @author vincent hong 
 * @date: 2019/3/15 23:42
 * @since 1.0.0
 */
public class OutSideTomcatSpringBootSevletInit extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BootApplication.class);
    }
}
