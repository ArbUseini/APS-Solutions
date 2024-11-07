public class Main{
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        DLL<Integer> dll = new DLL<Integer>();

        for (int i = 0; i < n; i++){
            dll.insertLast(cin.nextInt());
        }

        System.out.println(dll);


        DLLNode<Integer> before = dll.getFirst();
        DLL<Integer> dll2 = new DLL<Integer>();

        int shift = cin.nextInt()%n;

        if (n==0 || n==1) {
            System.out.println(dll);
            return;
        }

        for (int i = 0; i < n-shift; i++){
            before = before.succ;
        }

        for (int i = 0; i < n; i++){
            if (before == null){
                before = dll.getFirst();
            }
            dll2.insertLast(before.element);
            before = before.succ;
        }

        System.out.println(dll2);
    }
}