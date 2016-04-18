package com.demaxiya.utils.ChangeDatabases;


import com.demaxiya.utils.CodeUtil;

/**
 * 实现改变数据库连接接口
 * 来修改数据库连接到主数据库
 * Created by xiaoqiang on 2016/3/17.
 */
public class MasterSource implements DatabaseSourceChange {
    @Override
    public void Change() {
        MultipleDataSource.setDataSourceKey(CodeUtil.conMaster);
    }
}
