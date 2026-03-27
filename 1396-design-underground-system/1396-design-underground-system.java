class UndergroundSystem {
    // id -> {stationName, checkInTime}
    private Map<Integer, String[]> checkIns;
    // "start,end" -> {totalTime, tripCount}
    private Map<String, double[]> tripData;

    public UndergroundSystem() {
        checkIns = new HashMap<>();
        tripData = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new String[]{stationName, String.valueOf(t)});
    }
    
    public void checkOut(int id, String stationName, int t) {
        String[] checkIn = checkIns.get(id);
        String start = checkIn[0];
        int checkInTime = Integer.parseInt(checkIn[1]);
        
        String key = start + "," + stationName;
        tripData.putIfAbsent(key, new double[]{0, 0});
        
        tripData.get(key)[0] += (t - checkInTime); // total time
        tripData.get(key)[1]++;                     // trip count
        
        checkIns.remove(id);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + "," + endStation;
        double[] data = tripData.get(key);
        return data[0] / data[1];
    }
}