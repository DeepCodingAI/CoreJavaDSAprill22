package lambdaexpression;

public class ApplyLambdaExpression {
    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            public void start() {
                System.out.println("turn the engine to move the car");
            }

            @Override
            public void stop() {
                System.out.println("hit the break pad to stop the car");
            }
        };
        car.start();
        car.stop();

        Engine engine = (a,b)->System.out.println(a+b);
        engine.fly(1,20);

        Boat motorBoat = ()-> System.out.println("Boat need to float in water and implement motor to speed up");
        motorBoat.runOnWater();

        RideSharing rideSharing = s-> System.out.println(s);
        rideSharing.carOnDemand("make lyft or uber call to go to airport");

    }
}
