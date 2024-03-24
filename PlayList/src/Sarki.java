public class Sarki {
    private String ad;
    private String sanatci;
    private String album;
    private int sure;
    public Sarki(String ad , String sanatci , String album , int sure){
        this.ad = ad;
        this.sanatci = sanatci;
        this.album = album;
        this.sure = sure;
    }
    public String getAd(){
        return ad;
    }
    public String getSanatci(){
        return sanatci;
    }
    public String getAlbum(){
        return album;
    }
    public int getSure(){
        return sure;
    }

}
