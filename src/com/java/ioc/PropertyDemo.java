package com.java.ioc;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Administrator on 2018/8/11 0011.
 */
public class PropertyDemo {
    private String[] arrs;
    private List<String> list;
    private Map<String, String> map;
    private Properties properties;

    public String[] getArrs() {
        return arrs;
    }

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

}
