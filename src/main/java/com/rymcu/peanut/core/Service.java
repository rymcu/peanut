package com.rymcu.peanut.core;

import java.util.List;

/**
 * @author ronger
 */
public interface Service<T, ID> {

    /**
     * 查询
     * @param model
     * @return
     */
    T find(T model);

    /**
     * 查询所有
     * @return
     */
    List<T> findAll();

    /**
     * 通过主键查询
     * @param id
     * @return
     */
    T findById(ID id);

    /**
     * 保存
     * @param model
     * @return
     */
    T save(T model);

    /**
     * 更新
     * @param model
     * @return
     */
    T update(T model);

    /**
     * 删除
     * @param model
     * @return
     */
    T delete(T model);

}
