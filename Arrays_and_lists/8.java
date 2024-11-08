public class Main{
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        DLL<Integer> dll = new DLL<Integer>();

        for (int i = 0; i < n; i++){
            dll.insertLast(cin.nextInt());
        }

        for (int k = cin.nextInt()%n; k > 0; k--){
            dll.insertLast(dll.getFirst().element);
            dll.deleteFirst();
        }

        System.out.println(dll);
    }
}