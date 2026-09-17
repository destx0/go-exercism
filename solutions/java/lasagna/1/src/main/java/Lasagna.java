public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int time){
        return 40 - time;
    }
    public int preparationTimeInMinutes(int layers){
        return 2 * layers;
    }
    public int totalTimeInMinutes(int layers , int time){
        return preparationTimeInMinutes(layers) + time;
    }
    // TODO: define the 'expectedMinutesInOven()' method

    // TODO: define the 'remainingMinutesInOven()' method

    // TODO: define the 'preparationTimeInMinutes()' method

    // TODO: define the 'totalTimeInMinutes()' method
}
