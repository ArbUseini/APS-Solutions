public class Main{
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        Array<Integer> arr = new Array<Integer>(n);
        double avg = 0;

        for (int i = 0; i < n; i++){
            arr.insertLast(cin.nextInt());
            avg += arr.get(i);
        }

        System.out.println(arr);
        
        avg /= n;

        for (int i = 0; i < n; i++){
            if (arr.get(i) < avg){
                arr.delete(i);
                i--;
                n--;
            }
        }

        System.out.println(arr);

    }
}