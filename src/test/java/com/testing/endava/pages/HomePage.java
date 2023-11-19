package com.testing.endava.pages;

import org.springframework.stereotype.Component;

@Component
public class HomePage extends AbstractPage {

    public HomePage() {
        InitPage();
        System.out.println("Page HomePage instantiated");
    }


    public void getPage() {
        System.out.println("HomePage.");
    }
}
