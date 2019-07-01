import java.util.*;
import java.math.*;

class CountExample{
    public static void main(String args[]){
       Test obj  = new Test();
       Test obj1  = new Test();
       //obj.uniqueList();
       //obj.singleElement();
       int[] ab = {1,2,3,4,5,6,7,8,9,10,11,12,13};
       int[] ab1 = {1,1,2,2,3,3,3,4,4,5,5,6,6,7,8,9,10,10,10,11,11,23,23,22,24,34,34,45,46,48};
       obj1.uniqueElement(ab1);
        int position  = 4;
        //int[] ans =  
       // System.out.println(obj.);
       //obj.rotateArray(ab,position);
        //System.out.println();
       //System.out.println(obj1.rAs(ab,4) );
        String w  = "Microsoft";
       char[][] mx = {{'M','I','c','r','o','s','o','f','t'},
                      {'i','i','C','r','o','s','o','f','t'},
                      {'c','i','c','R','o','s','o','f','t'},
                      {'r','i','c','r','O','s','o','f','t'},
                      {'o','i','c','r','o','S','o','f','t'},
                      {'s','i','c','r','o','s','O','f','t'},
                      {'o','i','c','r','o','s','o','F','t'},
                      {'f','i','c','r','o','s','o','f','T'},
                      {'t','i','c','r','o','s','o','f','T'}};
       // System.out.println(obj1.searchWord(mx, w));




    }}
class Test{
    int[] a =  { 1,1,2,2,3,3,3,4,4,5,5,6,6,7,8,9,10,10,10,11,11,23,23,22,24,34,34,45,46,48 };
    int[] b = {1,2,3,4,5,6,7,8,1,1,2,3,4,9,5,6,7,1,2,3,4,5,6,7};
    
    int aa[] = new int[30];
    Set<Integer> set1 = new LinkedHashSet<>();
    ArrayList<Integer> as  = new ArrayList<Integer>();
    int j =0;
    public void uniqueList(){for(int i=0;i<a.length;i++){if (a[i] !=a[i+1]){
    as.add(a[i]); j++;}if (i == a.length-2){if(a[a.length-2]!= a[a.length-1]){
    as.add(a[a.length-1]);break;}}}System.out.println(as);
     // method 2 
      for(Integer az :a){set1.add(az);} System.out.println(set1);
    } 

    public void singleElement(){Map<Integer,Integer> m1=new HashMap<Integer,Integer>(); 
    for(int i =0;i<b.length;i++){Integer v = m1.get(b[i]); m1.put(b[i],(v==null)?1:v+1);}
    for(Map.Entry<Integer,Integer> val : m1.entrySet()){if(val.getValue()==1){
    System.out.print(val.getKey() +" ");}}}

    public void rotateArray(int az[],int p){
        int ele = az[p-1];int i=0;
        for(int i1=0;i1<az.length;i1++){System.out.print(az[i1]+" ");}System.out.println(); 
        int temp = az[0]; 
        while(az[az.length-1] !=ele){
            az[i] = az[i+1];
            i++;
            if(i==az.length-1)
            {az[az.length-1] = temp; 
            temp = az[0]; i=0;}}
    for(int i1=0;i1<az.length;i1++){System.out.print(az[i1]+" ");}
    }

    public int[] r(int az[],int p){int[] array4  =  new int[az.length];
    int k =0;for(int i = p;i<az.length;i++){array4[k] = az[i];k++;}
    for (int i =0;i<p;i++){array4[k] = az[i];k++;}return array4;
    }

    public String bSearch(int[]az, int l,int h, int sel){
    while (l<=h){int m = (l + h) / 2;
            if (az[m] > sel) {
                h = m - 1;
            }
    else if (az[m]<sel){l = m+1;}else{return m+"";}}return "not found";
    }

    
public String rAs(int[]az, int sel){
        int l  = 0;
        int h = az.length-1;
    while (l<=h)
    {int m = (l + h) / 2;
        //System.out.println(az[m] +"  "+ m); 
        if (az[m] == sel){return m+"";}
        if (az[l]<=az[m]){if(sel>=az[l] && sel<=az[m]){h = m-1;}else{l = m+1;}}
        else{ 
            if (sel >= az[m] && sel <= az[h]) {l =  m+1;}else{h =m-1;} }
    }
        return "n";
    }

    public boolean searchWord(char [][] mx,String w){
        String wor = "";
        // search in rows
        for(int i = 0;i<mx.length;i++){
                for(int j = 0;j<mx.length;j++){
                    if(w.length()>mx.length-j){}
                    else{
                    for(int k = j;k<w.length();k++){
                        wor = wor+mx[i][k];
                    }}
                    if(wor.equals(w)){
                        return true;
                    }
                    wor = "";
                }
        }
        System.out.println("Not found in rows");
        for(int i = 0;i<mx.length;i++){
            for(int j = 0;j<mx.length;j++){
                if(w.length()>mx.length-j){}
                else{
                for(int k = j;k<w.length();k++){
                    wor = wor+mx[k][i];
                }}
                if(wor.equals(w)){
                    return true;
                }
                wor = "";
            }
    }

        return false;
    }


    public void uniqueElement( int[] aa){
        for(int i =0 ,j=1;i<aa.length;i++,j++){
             if (aa[i] !=aa[j]){System.out.print(aa[i]+" ");}
        }

    }
}