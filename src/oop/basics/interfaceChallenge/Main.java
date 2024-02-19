package oop.basics.interfaceChallenge;

public class Main {
    public static void main(String[] args) {
        Browser chrome = new Chrome();
        chrome.gotoPage("Google");
        Browser firefox = new Firefox();
        firefox.gotoPage("go to");
    }
}
