package com.demo.springmvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author whh
 * @date 2020/2/2 - 23:06
 */
@Data //除了有参构造函数都有了
@AllArgsConstructor//加上无参构造函数就没有了
@NoArgsConstructor//无参构造函数
public class UserInfo {

    private int id;
    private String uname;
    private int unumber;

}
