package com.zyc.annotation;

import java.lang.annotation.*;


/**
 * Target_该注解用于方法声明
 * Retention_VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息
 * Inherited_允许子类继承父类中的注解
 * Documented_将此注解包含在javadoc中
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface AnnoZ {

    String value() default "zyc";

    int version() default 1;

    String[] group() default {"a","b"};
}
