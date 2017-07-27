package com.zyc.annotation;

import java.lang.reflect.Field;

/**
 * Created by Administrator on 2017/5/12.
 */
public class AnnoZModel {

    @AnnoZ(value = "one field",version = 1,group = {"a","b"})
    private String fieldOne;

    @AnnoZ("two field")
    private int fieldTwo;


    public String getFieldOne() {
        return fieldOne;
    }

    public void setFieldOne(String fieldOne) {
        this.fieldOne = fieldOne;
    }

    public int getFieldTwo() {
        return fieldTwo;
    }

    public void setFieldTwo(int fieldTwo) {
        this.fieldTwo = fieldTwo;
    }

    public static void main(String[] args){

        Field[] fields = AnnoZModel.class.getDeclaredFields();
        for (Field field:fields){
            if (field.isAnnotationPresent(AnnoZ.class)){
                AnnoZ annoZ = field.getAnnotation(AnnoZ.class);
                System.out.println("value :"+annoZ.value()+",version:"+annoZ.version()+",group:"+annoZ.group());
            }
        }
    }
}
