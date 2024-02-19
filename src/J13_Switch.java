public class J13_Switch {

    enum CarVariant {SEDAN,COMBI,HATCHBACK};

    public static void main(String[] args) {
        int num = 1;
        switch (num){
            case 1:
                System.out.println(1);
                System.out.println("ok");
            break;
            case 3:
                System.out.println(3);
            break;
            case 10:
                System.out.println(10);
                break;
            default:
                System.out.println("Default");
        }

        String str = "Ania";
        switch (str){
            case "Ola":
                System.out.println("Ola");
                break;
            case "Ania":
                System.out.println("ania");
                break;
            default:
                System.out.println("Default"+str);
        }
        CarVariant car = CarVariant.COMBI;

        switch (car){
            case COMBI:
                System.out.println(CarVariant.COMBI);
                break;
            case SEDAN:
                System.out.println(CarVariant.SEDAN);
                break;
            case HATCHBACK:
                System.out.println(CarVariant.HATCHBACK);
                break;
            default:
                System.out.println("Default");
        }

    }
}
