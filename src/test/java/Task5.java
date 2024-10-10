public class Task5 {
    public static void main(String[] args) {
        int [] weight = {1,2,3,4,5};
        int [] score = {6,7,8,9,10};
        int scoreweight =((weight[0]*score[0])+(weight[1]*score[1])+(weight[2]*score[2])+(weight[3]*score[3])+(weight[4]*score[4]));
        int WeightAverage = (scoreweight / (weight[0]+weight[1]+weight[2]+weight[3]+weight[4]));
        System.out.println("Weighted Averege :  "+ WeightAverage);
    }
}
