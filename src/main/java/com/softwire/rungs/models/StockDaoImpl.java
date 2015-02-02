package com.softwire.rungs.models;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

public class StockDaoImpl extends HibernateDaoSupport implements StockDao{

    public void save(Stock stock){
        getHibernateTemplate().save(stock);
    }

    public void update(Stock stock){
        getHibernateTemplate().update(stock);
    }

    public void delete(Stock stock){
        getHibernateTemplate().delete(stock);
    }

    public Stock findByStockCode(String stockCode){
//        getHibernateTemplate().getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);

        List list = getHibernateTemplate().find(
                "from Stock where stockCode=?",stockCode
        );
        if(list.isEmpty()){
            return null;
        } else {
            return (Stock) list.get(0);
        }
    }
}