import java.util.ArrayList;
import java.util.Arrays;

public class Liste {
    public static void main(String[] args){
     String[][] liste1 = new String [8] [3];
     liste1[0][0] = "4711";
     liste1[0][1] = "Brunner";
     liste1[0][2] = "rot";
     liste1[1][0] = "0042";
     liste1[1][1] = "Hilt";
     liste1[1][2] = "blau";
     liste1[2][0] = "1234";
     liste1[2][1] = "Leipe";
     liste1[2][2] = "grün";
     liste1[3][0] = "9876";
     liste1[3][1] = "Stadler";
     liste1[3][2] = "pink";
     liste1[4][0] = "0007";
     liste1[4][1] = "Wiesner";
     liste1[4][2] = "schwarz";
     liste1[5][0] = "2222";
     liste1[5][1] = "Harbecke";
     liste1[5][2] = "orange";
     liste1[6][0] = "1986";
     liste1[6][1] = "Kaplan";
     liste1[6][2] = "gelb";
     liste1[7][0] = "5432";
     liste1[7][1] = "Sahindas";
     liste1[7][2] = "rot";

     String[][] liste2 = new String [8] [3];
     liste2[0][0] = "4711";
     liste2[0][1] = "001.2";
     liste2[0][2] = "01.01.2020";
     liste2[1][0] = "4711";
     liste2[1][1] = "001.3";
     liste2[1][2] = "01.01.2020";
     liste2[2][0] = "4711";
     liste2[2][1] = "002.1";
     liste2[2][2] = "01.01.2020";
     liste2[3][0] = "0042";
     liste2[3][1] = "003.3";
     liste2[3][2] = "01.01.2020";
     liste2[4][0] = "1234";
     liste2[4][1] = "004.3";
     liste2[4][2] = "01.01.2020";
     liste2[5][0] = "1234";
     liste2[5][1] = "004.2";
     liste2[5][2] = "01.01.2020";
     liste2[6][0] = "4711";
     liste2[6][1] = "001.4";
     liste2[6][2] = "01.01.2020";
     liste2[7][0] = "0007";
     liste2[7][1] = "005.1";
     liste2[7][2] = "01.01.2020";
     ArrayList<String> arrayList = new ArrayList<String>();
        for(int i=0; i<liste2.length;i++){
            arrayList.add(liste2[i][0]);
     }

    ausgabe(arrayList, liste1, liste2);
}
    public static void ausgabe(ArrayList<String> arrayList, String[][] liste1, String[][] liste2) {
     ArrayList<String> arrayList2= new ArrayList<String>();
     for(int i=0; i<liste1.length; i++){
      if(arrayList.contains(liste1[i][0]) && !arrayList2.contains(liste1[i][1])){
          arrayList2.add(liste1[i][1]);
        }
    }
    System.out.println(arrayList2.toString());
    }
}
