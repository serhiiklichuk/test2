package com.example.lib.main.test;

public class MyClass {

    public static void main(String[] args) {
        INow now = new Now();
        ILogger logger = new Logger();
        Ihttp http = new Http();
        System.out.println(new Main(now, logger, http).evaluate());
    }

//    function() {
//        if now.isMonday() {
//            try {
//                resp = http.get("https://httpbin.org/uuid") // response body: {"uuid": "some random string"}
//                return resp["uuid"]
//            } catch {
//                log.error("error: ", err_reason)
//            }
//        } else {
//            log.debug("skip")
//        }
//    }
}