package oop.basics;
class Roadster{
    float topSpeed,acceleration,crazyTopSpeed,crazyAcceleration;
    Roadster(float topSpeed,float acceleration){
        this.acceleration = acceleration;
        this.topSpeed = topSpeed;
    }
    Roadster(float topSpeed,float acceleration,float crazyTopSpeed,float crazyAcceleration){
        this.crazyAcceleration = crazyAcceleration;
        this.crazyTopSpeed = crazyTopSpeed;
        this.acceleration = acceleration;
        this.topSpeed = topSpeed;
    }
    public float getTopSpeed(){
        return this.topSpeed;
    }
    public float getAcceleration(){
        return this.acceleration;
    }
    public float getTopSpeed(boolean crazyMode){
        if(crazyMode){
            return crazyTopSpeed;
        }else{
            return topSpeed;
        }
    }

    public float getAcceleration(boolean crazyMode) {
        if(crazyMode){
            return crazyAcceleration;
        }else{
            return acceleration;
        }
    }
}
public class task_RoadsterChallenge {
    public static void main(String[] args) {

        Roadster car1 = new Roadster(250.0f,4.0f);
        System.out.println(car1.getTopSpeed());
        Roadster car2 = new Roadster(250.0f,4.0f,300.0f,1.9f);
        System.out.println(car2.getTopSpeed(true));
    }
}
