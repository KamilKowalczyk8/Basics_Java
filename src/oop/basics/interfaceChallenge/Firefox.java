package oop.basics.interfaceChallenge;

public class Firefox implements Browser{
    protected String url;

    @Override
    public void gotoPage(String url) {
        this.url = url;
        System.out.println("Firefox url:"+ url);
    }

    @Override
    public void refreshPage() {

    }

    @Override
    public void booksmarkPage() {

    }
}