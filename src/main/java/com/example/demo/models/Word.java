package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Word")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long wordID;

    @Column(name="Meaning")
    private String meaning;

    @Column(name="Pronunciation")
    private String pronunciation;

    @Column(name="Type")
    private String type;

    @Column(name="Img")
    private String img;

    @Column(name="Text")
    private String text;

    @Column(name="Sound")
    private String sound;

    public Word(){

    }

    public long getWordID() {
        return wordID;
    }

    public void setWordID(long wordID) {
        this.wordID = wordID;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
