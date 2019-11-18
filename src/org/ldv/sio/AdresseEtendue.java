package org.ldv.sio;

public class AdresseEtendue {
    private String email;
    private String url;

    public AdresseEtendue(String email,String url){
        this.email = email;
        this.url = url;

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "AdresseEtendue{" +
                ", email='" + email + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
