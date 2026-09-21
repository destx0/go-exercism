
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8 ,4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int bird : birdsPerDay){
            if (bird == 0 ){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int res = 0;
        for (int bird : birdsPerDay){
            if (numberOfDays > 0 ){
                res += bird;
                numberOfDays--;
            }
        }
        return res;
    }

    public int getBusyDays() {
        int res = 0;
        for (int bird : birdsPerDay){
            if (bird >= 5 ){
                res ++;
            }
        }
        return res;
    }
}
