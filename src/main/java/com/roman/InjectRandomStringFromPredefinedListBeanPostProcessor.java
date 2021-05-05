package com.roman;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Random;

public class InjectRandomStringFromPredefinedListBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field:fields){
            InjectRandomString annotation = field.getAnnotation(InjectRandomString.class);
            if(annotation != null){
               String [] rows = annotation.rows();
                Random random = new Random();
                int i = random.nextInt(rows.length);
                field.setAccessible(true);
                ReflectionUtils.setField(field,bean,rows[i]);
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
