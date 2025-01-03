package Queue.exercices;

import Queue.queue.Queue;

public class PrintDocs {
    public static void main(String[] args) throws Exception{

        Queue<Document> printer = new Queue<>();

        printer.enqueue(new Document("A", 1));
        printer.enqueue(new Document("B", 5));
        printer.enqueue(new Document("C", 9));
        printer.enqueue(new Document("D", 13));
        printer.enqueue(new Document("E", 10));

        while (!printer.isEmpty()){
            Document doc = printer.unqueue();
            System.out.println("Print document: "+ doc.getName());
            try {
                Thread.sleep(200 * doc.getSheets());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("All elements were printed!");
        }
    }
}
