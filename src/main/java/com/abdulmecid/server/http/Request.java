package com.abdulmecid.server.http;

public class Request {
    private String method;
    private String path;
    private String params;
    private String protocol;
    private String body;
    private String version;

    public Request(String method, String path, String params, String protocol, String body, String version) {
        this.method = method;
        this.path = path;
        this.params = params;
        this.protocol = protocol;
        this.body = body;
        this.version = version;
    }

    public String getMethod() {
        return method;
    }

    public String getPath() {
        return path;
    }

    public String getParams() {
        return params;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getBody() {
        return body;
    }

    public String getVersion() {
        return version;
    }

    

}