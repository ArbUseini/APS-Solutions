public class Main{
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        SLL<String> sll = new SLL<String>();
        int n = cin.nextInt();

        for (int i = 0; i < n; i++){
            sll.insertLast(cin.next());
        }

        System.out.println(sll);
        
        SLLNode<String> node = sll.getFirst();
        int len = cin.nextInt();

        for (int i = 0; i < n; i++){
            if (node.element.length() == len){
                SLLNode<String> tmp = node.succ;
                sll.insertLast(node.element);
                sll.delete(node);
                node = tmp;
            }else{
                node = node.succ;
            }
        }

        System.out.println(sll);
    }
}