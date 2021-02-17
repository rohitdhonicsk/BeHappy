package com.mycompany.behappy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saura
 */
public class MotivationalQuote{
    private String authorName;
    private String quote;

    public MotivationalQuote() {
        this.authorName = null;
        this.quote = null;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
    
}
