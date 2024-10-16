public class Task5 {
    public static void main(String[] args) {
        for (int w = 5; w >=0; w--) {
            for (int p = 0; p < w; p++) {
                System.out.print("* ");
                
            }
            for (int e = w; e <= 5; e++) {
                System.out.print(e + " ");
                
            }
            System.out.println();
            
        }
    }
    
}
