package com.example.lib.main.test;

public class Main {

    INow now;
    ILogger logger;
    Ihttp http;

    public Main(INow now, ILogger logger, Ihttp http) {
        this.now = now;
        this.logger = logger;
        this.http = http;
    }

    public String evaluate() {
        if (now.isMonday()) {
            Response resp = sendRequest();
            if (resp != null) {
                return resp.getUid();
            }
        } else {
            logger.debug("not monday");
        }
        return null;
    }

    private Response sendRequest() {
        try {
            return http.get("https://httpbin.org/uuid");
        } catch (Exception ex) {
            logger.error("request failed", ex);
        }
        return null;
    }
}
