public class Main{
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int sum = 0;
        DLL<Integer> dll = new DLL<Integer>();

        for (int i = 0 ; i < n; i++){
            int a = cin.nextInt();
            sum += a;
            dll.insertLast(a);
        }

        DLLNode<Integer> node = dll.getFirst();
        int count = 0;
        int diff = node.element;
        sum -= node.element;

        for (int i = 1; i < n-1; i++){
            node = node.succ;
            sum -= node.element;
            if (diff*1.0/i > sum*1.0/(n-i-1)){
                count++;
            }
            diff += node.element;
        }

        System.out.println(count);
    }
}