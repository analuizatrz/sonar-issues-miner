package br.unb.cloudissues.http;

import java.util.Base64;

import okhttp3.Request;

public class AuthorizedRequestBuilder {
    //static String token = "sqa_e1e7c3db707293082b26f073750a23ab895c3bfa";
    static String token = "squ_9034f2423e5aed0687abc85ad602139f0cd9930b";
   //static String token = "c3F1XzkwMzRmMjQyM2U1YWVkMDY4N2FiYzg1YWQ2MDIxMzlmMGNkOTkzMGI6";

    // TODO: put in config 
    // public AuthorizedRequestBuilder(String token) {
    //     this.token = token;
    // }

    public static okhttp3.Request.Builder Builder(){
        String user_token = token + ":";
        String basicToken = Base64.getEncoder().encodeToString(user_token.getBytes());

        return new Request.Builder().addHeader("Authorization", "Basic " + basicToken);
    }

}
