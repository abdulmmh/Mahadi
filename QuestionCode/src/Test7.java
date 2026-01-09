
public class Test7 {
    public static void main(String[] args) {
        int x = 3, y = 4;
        switch(x + 3){
            case 6: y = 0;
            case 7: y = 1;deafult: y += 1;    
        }
        System.out.println(y);
    }
}
