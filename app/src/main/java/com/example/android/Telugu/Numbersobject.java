package com.example.android.Telugu;

public class Numbersobject {
    String english;
    String telugu;
    private int image = NO_IMAGE_PROVIDED;


    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;
    int audio;

    public Numbersobject(String a, String b, int c, int recording){
        english=a;
        telugu=b;
        image=c;
        audio=recording;
    }

    public Numbersobject(String s, String s1,int recording) {
        english=s;
        telugu=s1;
        audio=recording;
    }

    public String getEnglish(){
        return english;
    }
    public String getTelugu(){
        return telugu;
    }
    public int getimageid(){
        return image;
    }
    public int getaudioid(){
        return audio;
    }

    public boolean hasImage() {
        return image != NO_IMAGE_PROVIDED;
    }
}
