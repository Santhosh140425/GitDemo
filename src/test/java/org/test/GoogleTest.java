package org.test;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
public class GoogleTest {

    @Test
    public void san(){
        open("https://www.google.com");
        System.out.println("Done");
    }
    public void sandy(){
        System.out.println("tamba");
    }
}
