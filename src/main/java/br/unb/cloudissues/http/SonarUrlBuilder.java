package br.unb.cloudissues.http;

public class SonarUrlBuilder {
    static String baseUrl = "http://localhost:9000/api/";

    // TODO: put in config file
/*     public SonarUrlBuilder(String baseUrl) {
        this.baseUrl = baseUrl;
    } */
    public String BuildUrl(){
        return baseUrl;
    }

}
