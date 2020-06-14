package com.test.tableau.Mapper;

import com.test.tableau.Bean.User;
import com.test.tableau.Bean.User2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 大佬们  为什么老师讲课这个借口不要mapper  "
 *  @蕉下客 Mapper注解的的作用:
 *  1，为了把mapper这个DAO交給Spring管理
 *  2，为了不再写mapper映射文件
 *  3，为了给mapper接口自动根据一个添加@Mapper注解的接口生成一个实现类
 *
 * 1.新建  实体类   java必须
 * 2.接口     来自于实体类，类的抽象
 * 3.service 负责写业务逻辑
 * 4.mybatis 封装sql
 * 5.controller 只负责路由，返回路由地址
 *
 * mybatis 跟 接口交互（传参）
 * mybatis xml id 来自于 mapper 接口的方法名， resulttype 来自于bean实体类
 * controller 来自于 service里面调用service类
 * 然后controller里面实现路由，交给前端
 * 如果是带参数，要在mapper接口里面设置
 */
@Mapper
public interface UserMapper {
    /**
     * 1.query all user
     */
    public List<User> getAllUsers();


    /**
     * 2.query by username
     */
    public List<User> getUserByName(Long sex);


}
