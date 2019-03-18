/**
 * Copyright (C), 2018-2019, from  vincent hong
 * FileName: CustomerDto
 * Author:   vincent hong
 * Date:     2019/3/16 0:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.vincent.hong.repositories.dao;


import com.vincent.hong.entity.dto.Customer;

import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author vincent hong 
 * @date: 2019/3/16 0:08
 * @since 1.0.0
 */
public interface CustomerDao {

    List<Customer> selectAllCustomer(Map<String,Object> param);
}
