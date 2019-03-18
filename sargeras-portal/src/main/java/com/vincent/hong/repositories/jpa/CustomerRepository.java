/**
 * Copyright (C), 2018-2019, from  vincent hong
 * FileName: CustomerJpa
 * Author:   vincent hong
 * Date:     2019/3/16 0:09
 * Description: 操作customer的jpa
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.vincent.hong.repositories.jpa;


import com.vincent.hong.entity.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈操作customer的jpa〉
 *
 * @author vincent hong 
 * @date: 2019/3/16 0:09
 * @since 1.0.0
 */
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    public List<Customer> findAll();
}
