package com.hz.design.criteria;

import java.util.List;

/**
 * 过滤接口
 *
 * Created by hezhao on 2018-08-09 09:30
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);

}
