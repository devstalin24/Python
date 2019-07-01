import java.io.*;
import java.util.*;
class Test {
    public static void main(String args[] ) throws Exception {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String node_edge  =  br.readLine();
        int node  = Integer.parseInt(node_edge.split(" ")[0]);
        int edge = Integer.parseInt(node_edge.split(" ")[1]);
        System.out.println(edge +" " +node);

        int[][] ar = new int[node+1][node+1];
        for(int i=0;i<node;i++){
            for(int j = 0;j<node;j++){
                ar[i][j] =0;
            }
        }
        for(int i=0;i<edge;i++){
            String x_y = br.readLine();
            int x =  Integer.parseInt(x_y.split(" ")[0]);
            int y =  Integer.parseInt(x_y.split(" ")[1]);
            ar[x][y] =1;
        } 
        
        int quaries  =  Integer.parseInt(br.readLine());
        for(int i =0;i<quaries;i++){
            String A_B = br.readLine();
            int a  = Integer.parseInt(A_B.split(" ")[0]);
            int b = Integer.parseInt(A_B.split(" ")[1]);
            if(ar[a][b] == 1){System.out.println("YES");}
            else{System.out.println("NO");}
        }

    }
}
