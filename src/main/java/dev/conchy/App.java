package dev.conchy;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public class Main {
        public static void main(String[] args) {
            Computer comp1 = new Computer("Dell", 16, "Intel i7", "Windows 10", 1200.00);
            Computer comp2 = new Computer("Apple", 8, "M1", "macOS", 1500.00);
    
            System.out.println(comp1);
            System.out.println(comp2);
        }
    }
    
