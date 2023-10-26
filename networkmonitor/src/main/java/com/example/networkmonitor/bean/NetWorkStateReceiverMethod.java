package com.example.networkmonitor.bean;

import java.lang.reflect.Method;

public class NetWorkStateReceiverMethod {
    Method method;
    Object object;
    NetWorkState[] netWorkState = {NetWorkState.GPRS,NetWorkState.WIFI,NetWorkState.NONE};

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public NetWorkState[] getNetWorkState() {
        return netWorkState;
    }

    public void setNetWorkState(NetWorkState[] netWorkState) {
        this.netWorkState = netWorkState;
    }
}
