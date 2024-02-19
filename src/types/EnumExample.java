package types;

public class EnumExample {
    enum SoundVolume {LOW, MEDIUM,HIGH,VERY_HIGH};
    enum CarVariant {SEDAN ,COMBI,SUPER_CAR};
    public static void main(String[] args) {
        SoundVolume phoneSound = SoundVolume.LOW;
        System.out.println(phoneSound);
        double num = 196.0d;
        double sqrt = Math.sqrt(num);
        System.out.println(sqrt);
    }
}
