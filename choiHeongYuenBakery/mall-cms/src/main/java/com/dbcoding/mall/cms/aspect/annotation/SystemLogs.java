package com.dbcoding.mall.cms.aspect.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD})
public @interface SystemLogs {
    String key() default "";
}
