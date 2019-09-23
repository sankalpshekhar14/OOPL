import java.util.*;
class Tesla {
    String Model;
    int quantity;
    //boolean available = false;
 
    public synchronized void produce(String Model) {
      
        while (quantity!=0) {
            try {
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        this.Model = Model;
        System.out.println("Producer has produced " + Model);
        available = true;
        notify();
    }
 
    public synchronized void consume() {
        // if fruit is not available, consumer has to wait until producer produces one
        while (quantity!=20) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        System.out.println("Consumer has bought " + Model);
        this.Model = "";
        notify();
    }
 
    public int getQuantity() {
        return quantity;
    }
 
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Producer extends Thread {
    Tesla tesla;

    public Producer(Tesla f) {
        this.tesla =f;
    }

    public void run() {
        Tesla []cars=new Tesla[30];
       for(int i=0;i<30;i++){
            cars[i]=new Tesla();
            cars[i].Model="Model 3";
       }
        fruit.setQuantity(100);
        for (Tesla f : cars) {
            Tesla.produce("Model 3");
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


 

         
class Consumer extends Thread {
    private Fruit fruit;
 
    public Consumer(Fruit f) {
        this.fruit = f;
    }
 
    public void run() {
        int i = 0;
        do {
            fruit.consume();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        } while (i < fruit.getQuantity());
    }
}


public class ProducerConsumerTest {
    public static void main(String[] args) {
        Fruit f = new Fruit();
        Producer p = new Producer(f);
        Consumer c = new Consumer(f);
        p.start();
        c.start();
    }
}