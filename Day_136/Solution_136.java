package Day_136;

class Solution {
    public int startStation(int[] gas, int[] cost) {
        int total=0,tank=0,start=0;
        
        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            total+=diff;
            // overall net fuel after considering all the gas 
            tank+=diff;
            // keep trak of the gas from start
            if(tank<0){
                start=i+1;
                tank=0;
            }
        }
        return total>=0?start:-1;
    }
}