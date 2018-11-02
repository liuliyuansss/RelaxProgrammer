package cn.RelaxProgrammer.util;

import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyConvert implements Converter<String, Date> {
    private String format;

    public MyConvert(String format) {
        this.format = format;
    }

    @Override
    public Date convert(String s) {
        try {
            return new SimpleDateFormat(format).parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  null;
    }
}