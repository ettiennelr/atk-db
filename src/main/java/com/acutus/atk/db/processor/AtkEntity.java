package com.acutus.atk.db.processor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface AtkEntity {

    // if no column name is defined, what naming stratergy should be used
    ColumnNamingStrategy columnNamingStratergy() default ColumnNamingStrategy.NONE;

    String className() default "";

    String classNameExt() default "Entity";

    // 0 will always upgrade
    int version() default 0;

    // will auto add auditing fields
    boolean addAuditFields() default false;

    enum ColumnNamingStrategy {
        NONE, CAMEL_CASE_UNDERSCORE
    }

}
