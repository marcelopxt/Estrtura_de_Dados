package ExemploSlide;

public class App{
    public static void main(String[] args) {
        Deque<Numero> deque = new Deque<Numero>();
        try {
            for(int i=0; i<10; i++){
                if(Math.random()>0.5){
                    System.out.printf("addFirst(%d)\n", i);
                    deque.addFirst(new Numero(i));
                }else{
                    System.out.printf("addLast(%d)\n", i);
                    deque.addLast(new Numero(i));

                }
            }
            System.out.println("Deque Atual: ");
            deque.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
