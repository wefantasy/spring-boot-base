package com.ctgu.qmx.springbootbase.mapper.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * 自定义接口
 * @author Fantasy
 */
public interface CommonMapper<O> extends BaseMapper<O> {
    public List<O> doSelectBySome(O o);
}
