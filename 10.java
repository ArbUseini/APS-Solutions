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

        DLLNode<Integer> pre = node.succ;

        while (k != 0){
            if (pre == null){
                pre = dll.getFirst();
                dll.insertFirst(node.element);
                node = dll.getFirst();
                DLLNode<Integer> tmp = dll.getFirst();
                for (int i = 0; i < n; i++){
                    tmp = tmp.succ;
                }
                tmp.pred.succ = null;
                k--;
                continue;
            }
            int tmp = node.element;
            node.element = pre.element;
            pre.element = tmp;
            node = pre;
            pre = pre.succ;
            k--;
        }
        System.out.println(dll);
    }
}