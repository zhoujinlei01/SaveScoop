package com.example.networkmonitor.annotation;

import com.example.networkmonitor.bean.NetWorkState;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface NetWorkMonitor {
    NetWorkState[] monitorFilter() default {NetWorkState.GPRS,NetWorkState.WIFI,NetWorkState.NONE};
}
