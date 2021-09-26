package com.company.training.ch_9_method_references;


import java.util.List;
import java.util.function.Consumer;

public class _1_InstanceMethodReferenceParticularObjectExample {

    public static void main(String[] args) {

//        List<Integer> integerList= List.of(25,6,3,7,8,9,45);
//
//        integerList.forEach(a->{ System.out.println(a);  });
//
//        System.out.println("Using Instance Method Reference Particular Object");
//
//        integerList.forEach(System.out::println);


        Vehicle vehicle=new Vehicle();
        vehicle.setName("Tesla Model3");
        RepairPerson person=new RepairPerson();

        //using Anonymous
        fixingOrder(vehicle, new Consumer<Vehicle>() {
            @Override
            public void accept(Vehicle vehicle) {
                person.fixVehicle(vehicle);
            }
        });

        //using Lambda
        fixingOrder(vehicle,a->person.fixVehicle(a));

        //using Method Reference (Instance method reference with particular Object

        fixingOrder(vehicle,person::fixVehicle);

    }

    public static void fixingOrder(Vehicle vehicle, Consumer<Vehicle> vehicleConsumer){
        vehicleConsumer.accept(vehicle);
    }

}
