public class Main{
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        DLL<Integer> dll = new DLL<Integer>();

        for (int i = 0; i < n; i++){
            dll.insertLast(cin.nextInt());
        }

        System.out.println(dll);

        DLLNode<Integer> node = dll.getFirst();
        int m = cin.nextInt();
        int k = cin.nextInt()%n;

        for (int i = 0; i < n; i++){
            if (node.element == m){
                break;
            }
            node = node.succ;
        }

        if (node == null){
            System.out.println("Elementot ne postoi vo listata");
            System.out.println(dll);
            return;
        }

        DLLNode<Integer> pre = node.pred;
        while (k != 0){
            if (pre == null){
                pre = dll.getFirst();
                for (int i = 0; i < n-1; i++){
                    pre = pre.succ;
                }
                dll.insertLast(node.element);
                dll.delete(node);
                node = pre.succ;
                k--;
                continue;
            }
            int tmp = pre.element;
            pre.element = node.element;
            node.element = tmp;
            node = pre;
            pre = pre.pred;
            k--;
        }
        System.out.println(dll);
    }
}