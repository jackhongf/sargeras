/**
 * Copyright (C), 2018-2019, from  vincent hong
 * FileName: CommonbootConfig
 * Author:   vincent hong
 * Date:     2019/3/15 23:10
 * Description: boot统一配置类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.vincent.hong;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br> 
 * 〈boot统一配置类〉
 *
 * @author vincent hong 
 * @date: 2019/3/15 23:10
 * @since 1.0.0
 */
@EnableAutoConfiguration
@Configuration
@MapperScan(basePackages ="com.vincent.hong.repositories.dao")
public class CommonBootConfig {

}
