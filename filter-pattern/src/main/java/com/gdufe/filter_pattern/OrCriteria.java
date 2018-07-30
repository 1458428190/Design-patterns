package com.gdufe.filter_pattern;

import java.util.List;

/**
 * @Author: laichengfeng
 * @Description: 或 组合过滤
 * @Date: 2018/7/30  20:11
 */
public class OrCriteria implements Criteria{

    private List<Criteria> criteriaList;

    public OrCriteria(List<Criteria> criteriaList) {
        this.criteriaList = criteriaList;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> resultPersonList = personList;
        for(Criteria criteria: criteriaList) {
            resultPersonList = criteria.meetCriteria(resultPersonList);
        }
        return resultPersonList;
    }
}
