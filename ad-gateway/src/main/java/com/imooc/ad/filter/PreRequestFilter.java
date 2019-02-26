package com.imooc.ad.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class PreRequestFilter extends ZuulFilter {

    /**
     * 定义filter类型
     * @return
     */
    @Override
    public String filterType() {
        return null;
    }

    /**
     * 定义filter 顺序
     * 同一类型的过滤器有很多，他们的先后顺序由filterOrder来界定
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 我们可以定义一个当某些条件发生的时候再执行该过滤器，默认返回false
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
