package BuilderDesignPattern;

public class URLBuilder {

    public String protocol;
    public String hostname;
    public String port;
    public String pathParam;
    public String queryParam;

    public static class Builder{

        private String protocol;
        private String hostname;
        private String port;
        private String pathParam;
        private String queryParam;

        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder port(String port) {
            this.port = port;
            return this;
        }
        public Builder pathParam(String pathParam) {
            this.pathParam = pathParam;
            return this;
        }

        public Builder queryParam(String queryParam) {
            this.queryParam = queryParam;
            return this;
        }
        public URLBuilder build(){
            return new URLBuilder(this);
        }


    }
    URLBuilder(Builder builder){
        this.hostname = builder.hostname;
        this.port = builder.port;
        this.protocol= builder.protocol;
        this.pathParam = builder.pathParam;
        this.queryParam = builder.queryParam;
    }
}
