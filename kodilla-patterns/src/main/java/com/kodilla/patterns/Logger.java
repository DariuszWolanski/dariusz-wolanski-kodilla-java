package com.kodilla.patterns;

public enum Logger {

    LOG;

    private String lastLog = "";

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }

    public void removeLog(){
        this.lastLog = "";
    }

    public void addLog(String log){
        this.lastLog = log;
    }

}
