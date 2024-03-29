package oop.basics.Inheritance.homesChallenge;

class Flat{
    protected String city;
    protected String street;
    Flat(){

    }
    public Flat(String city, String street) {
        this.city = city;
        this.street = street;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
class House extends Flat{
    protected float parcelSize;

    public House(String city, String street, float parcelSize) {
        super(city, street);
        this.parcelSize = parcelSize;
    }

    @Override
    public String toString() {
        return "House{" +
                "parcelSize=" + parcelSize +
                '}';
    }

    public float getParcelSize() {
        return parcelSize;
    }

    public void setParcelSize(float parcelSize) {
        this.parcelSize = parcelSize;
    }
}

class Residence extends House {
    protected float garageSize;


    public Residence(String city, String street, float parcelSize, float garageSize) {
        super(city, street, parcelSize);
        this.garageSize = garageSize;
    }

    public float getGarageSize() {
        return garageSize;
    }

    public void setGarageSize(float garageSize) {
        this.garageSize = garageSize;
    }

    @Override
    public String toString() {
        return "Residence{" +
                "garageSize=" + garageSize +
                '}';
    }
}
public class Polymphorism {
        public static void main(String[] args) {
            Flat homes[] = new Flat[10];

            for(int i=1;i<homes.length;i++){
                int randNum = (int)Math.floor(Math.random() * 3);
                  if (randNum == 0) homes[i]=new Flat("Wawa","Wilcza");
                  if (randNum == 1) homes[i]=new House("Krk","Wiejksa",2);
                  if (randNum == 2) homes[i]=new Residence("Olsztyn","Smocza",3,3);
            }

            for(int i=0; i < homes.length;i++){
                System.out.println("Home i: "+i);
                Flat home = homes[i];
                if(home instanceof Residence){
                    Residence residence = (Residence) home;
                    System.out.println("Residence garage size: "+ residence.getGarageSize());
                    System.out.println(residence.toString());
                }else if(home instanceof House){
                    House house = (House) home;
                    System.out.println("House parcerl size:"+house.getParcelSize());
                    System.out.println(house.toString());
                }else{
                    System.out.println(home.toString());
                }

            }

        }
}

