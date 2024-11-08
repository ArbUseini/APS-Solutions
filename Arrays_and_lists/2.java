public class Main{
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);

        SLL<String> sll = new SLL<String>();
        int n = cin.nextInt();

        for (int i = 0; i < n; i++){
            sll.insertLast(cin.next());
        }

        System.out.println(sll);

        SLLNode<String> node =  sll.getFirst();
        int len = cin.nextInt();

        while (node != null){
            if (node.element.length() < len){
                sll.delete(node);
            }
            node = node.succ;
        }

        System.out.println(sll);
    }
}