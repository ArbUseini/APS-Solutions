public class Main{
    public static void main(String args[]){
        Scanner cin =  new Scanner(System.in);
        int n = cin.nextInt();
        DLL<Integer> dll = new DLL<Integer>();

        for (int i = 0; i < n; i++){
            dll.insertLast(cin.nextInt());
        }

        System.out.println(dll);

        int k = cin.nextInt()%n;
        DLLNode<Integer> node = dll.getFirst();

        for (int i = 0; i < n-1; i++){
            node = node.succ;
        }

        for (int i = 0; i < k; i++){
            dll.insertFirst(node.element);
            node = node.pred;
        }

        node = dll.getFirst();

        for (int i = 0; i < n-1; i++){
            node = node.succ;
        }

        node.succ = null;

        System.out.println(dll);

    }
}