import java.util.*;
public class Second_lesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.useLocale(Locale.ENGLISH);
        int[] arra = new int[n];
        for (int i=0;i<n;i++){
            arra[i]=sc.nextInt();
        }

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i=0;i<n;i++){
            if (arra[i]<0){
                neg.add(arra[i]);

            }
            else{
                pos.add(arra[i]);
            }
        }
        for (int a = 0; a<neg.size();a++){
            arra[a]=neg.get(a);
        }
        for (int a = 0; a<pos.size();a++){
            arra[a+neg.size()]=pos.get(a);
        }

        for(int a : arra){
            System.out.print(a + " ");
        }


    }


}
