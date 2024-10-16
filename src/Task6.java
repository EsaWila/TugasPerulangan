public class Task6 {
    public static void main(String[] args) {
        int w = 0, i = 0, l = 0;
        int p = 1;
        int e = 2;

        while (p <= 81) {
            if (e == 2) {
                e++;      
            }else {
                System.out.print(p + " ");
                p = w + i + l;    
            }   
            w = i;
            i = l;
            l = p;
        }
    }
    
}
