import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 0;
        double scoreSum = 0;

        for(int i = 0; i < 20; i++){
            String className = scan.next();
            double time = scan.nextDouble();
            String score = scan.next();
            
            switch(score){
                case "A+":
                    scoreSum += 4.5 * time;
                    cnt += time;
                    break;
                case "A0":
                    scoreSum += 4.0 * time;
                    cnt += time;
                    break;
                case "B+":
                    scoreSum += 3.5 * time;
                    cnt += time;
                    break;
                case "B0":
                    scoreSum += 3.0 * time;
                    cnt += time;
                    break;
                case "C+":
                    scoreSum += 2.5 * time;
                    cnt += time;
                    break;
                case "C0":
                    scoreSum += 2.0 * time;
                    cnt += time;
                    break;
                case "D+":
                    scoreSum += 1.5 * time;
                    cnt += time;
                    break;
                case "D0":
                    scoreSum += 1.0 * time;
                    cnt += time;
                    break;
                case "F":
                    cnt += time;
                    break;
            }
        }

        System.out.print((scoreSum / cnt));

    }
}