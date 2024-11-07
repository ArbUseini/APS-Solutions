public class Main{
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        SLL<String> sll = new SLL<String>();

        for (int i = 0; i < n; i++){
            sll.insertLast(cin.next());
        }

        System.out.println(sll);

        SLLNode<String> node = sll.getFirst();
        SLLNode<String> last = null;
        int len = cin.nextInt();

        while (node != null){
            if (node.element.length() == len){
                last = node;
            }
            node = node.succ;
        }

        if (last != null){
            String ins = last.element;
            sll.delete(last);
            sll.insertFirst(ins);
        }

        System.out.println(sll);
    }
}