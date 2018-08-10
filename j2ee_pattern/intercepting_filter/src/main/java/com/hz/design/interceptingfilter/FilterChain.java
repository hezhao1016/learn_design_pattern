package com.hz.design.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器链
 *
 * 过滤器链带有多个过滤器，并在 Target 上按照定义的顺序执行这些过滤器。
 *
 * Created by hezhao on 2018-08-10 16:56
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList<>();
    private Target target;

    // 添加过滤器
    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        // 执行before过滤器
        for (Filter filter : filters) {
            if (filter.isBefore()){
                filter.execute(request);
            }
        }

        target.execute(request);

        // 执行after过滤器
        for (Filter filter : filters) {
            if (!filter.isBefore()){
                filter.execute(request);
            }
        }
    }

    public void setTarget(Target target){
        this.target = target;
    }

}
