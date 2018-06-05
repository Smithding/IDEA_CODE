package com.itheima.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 三国的包子
 * @version 1.0
 * @description 描述
 * @title 标题
 * @date 2018/6/5
 * @package com.itheima.converter
 * @company www.itheima.com
 *
 * S: source 原来的数据类型
 * T:target 目标数据类型 一定要和POJO中的数据类型一致
 */
public class DateConverter implements Converter<String,Date>{

    @Override
    public Date convert(String source) {

        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date parse = format.parse(source);
            return parse;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
