package com.ly9999y.test.mybatis.sqlsession.defaults;

import com.ly9999y.test.mybatis.cfg.Configuration;
import com.ly9999y.test.mybatis.sqlsession.SqlSession;
import com.ly9999y.test.mybatis.sqlsession.SqlSessionFactory;


/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 * SqlSessionFactory接口的实现类
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg){
        this.cfg = cfg;
    }

    /**
     * 用于创建一个新的操作数据库对象
     * @return
     */
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
