package com.demaxiya.utils.ChangeDatabases;


/**
 * 数据库连接工厂
 * Created by xiaoqiang on 2016/3/17.
 */
public class DbConnectionFactory {
    /**
     * 静态工厂类
     * 由调用那个接口实现来切换数据库源
     * @return
     */
    //改变连接-->主数据库
    public static DatabaseSourceChange changeMaster(){
        return new MasterSource();
    }

    //改变连接-->从数据库
    public static DatabaseSourceChange changeSlave(){
        return new SlaveSource();
    }

}
