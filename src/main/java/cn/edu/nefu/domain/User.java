package cn.edu.nefu.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 用户实体表
 *
 * @author 唐学俊
 * @create 2018/06/16
 **/
@Getter
@Setter
@ToString
public class User {
    private int userId;
    private int userNo;
    private String phone;
    private String email;
    private int status;
    private String introduction;
    private int operatorId;

    //外键引用
    private Role role;
    private Profession profession;
}
