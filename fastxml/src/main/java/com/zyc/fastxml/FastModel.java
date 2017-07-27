package com.zyc.fastxml;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Created by Administrator on 2017/5/12.
 */
public class FastModel {

    @JsonProperty("F1")
    private String f1;

    @JsonProperty("F2")
    private String f2;

    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }

    public String getF2() {
        return f2;
    }

    public void setF2(String f2) {
        this.f2 = f2;
    }


}
