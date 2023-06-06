package BuilderDesignPattern;

public class BuilderDemo {

    public static void main(String[] args) {
        URLBuilder.Builder builder = new URLBuilder.Builder();
        builder.protocol("Http://").hostname("newwebsite:").port("8080");
        URLBuilder urlBuilder = builder.build();
        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostname);
        System.out.print(urlBuilder.port);
        System.out.println();

        URLBuilder.Builder builder1  = new URLBuilder.Builder();
        builder1.protocol("https://").hostname("google.com");
        URLBuilder urlBuilder1 = builder1.build();

        System.out.print(urlBuilder1.protocol);
        System.out.print(urlBuilder1.hostname);

    }
}
