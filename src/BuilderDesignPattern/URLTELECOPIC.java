package BuilderDesignPattern;

public class URLTELECOPIC {

    private String protocol;
    private String hostname;
    private String port;
    private String pathParam;
    private String queryParam;

    public URLTELECOPIC(String protocol, String hostname) {
        this.protocol = protocol;
        this.hostname = hostname;
    }

    public URLTELECOPIC(String protocol, String hostname, String port) {
        this(protocol,hostname);
        this.port = port;
    }

    public URLTELECOPIC(String protocol, String hostname, String port, String pathParam) {
        this(protocol,hostname,port);
        this.pathParam = pathParam;
    }

    public URLTELECOPIC(String protocol, String hostname, String port, String pathParam, String queryParam) {
       this(protocol,hostname,port,pathParam);
        this.queryParam = queryParam;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHostname() {
        return hostname;
    }

    public String getPort() {
        return port;
    }

    public String getPathParam() {
        return pathParam;
    }

    public String getQueryParam() {
        return queryParam;
    }
}
