package com.fkh.spring5;

public class Service {
    /*定义对象类型属性*/
    private Dao dao;

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    @Override
    public String toString() {
        return dao.update();
    }
}
