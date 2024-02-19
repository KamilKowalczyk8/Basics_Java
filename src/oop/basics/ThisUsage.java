package oop.basics;

class Radio{
   int volume;
   int yearProduction;
   String station;
   Radio(){
       this.yearProduction = 2000;
       volume = 100;// to samo co this.volume
   }
   Radio(int yearProduction){
        this();//wywołanie kostruktora
       this.yearProduction = yearProduction;
       this.changeStation("Rock");
   }
   public void changeStation(String newStation){
       this.station = newStation;
   }
   public Radio getRadio(){
       return this;
   }
   public void printRadioInfo(Radio radio){
       System.out.println(radio.yearProduction);
   }
}

public class ThisUsage {
    public static void main(String[] args) {
        Radio oldradio = new Radio(1996);
        Radio newradio = new Radio(2010);
        newradio.printRadioInfo(oldradio.getRadio());

    }
}
