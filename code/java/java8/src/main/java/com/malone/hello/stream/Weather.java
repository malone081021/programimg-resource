package com.malone.hello.stream;

public class Weather {
    private Integer minTem;
    private Integer maxTem;
    private Integer agvTem;

    public Weather(Integer minTem, Integer maxTem, Integer agvTem) {
        this.minTem = minTem;
        this.maxTem = maxTem;
        this.agvTem = agvTem;
    }

    public Integer getMinTem() {
        return minTem;
    }

    public void setMinTem(Integer minTem) {
        this.minTem = minTem;
    }

    public Integer getMaxTem() {
        return maxTem;
    }

    public void setMaxTem(Integer maxTem) {
        this.maxTem = maxTem;
    }

    public Integer getAgvTem() {
        return agvTem;
    }

    public void setAgvTem(Integer agvTem) {
        this.agvTem = agvTem;
    }
}
