import java.util.Random;
import java.util.Scanner;



class Main  {

    public static int stringi_generator(){
        Scanner scanner = new Scanner(System.in);
        String stringi = scanner.nextLine();
        if(stringi.equals("1")) {
            return 1;
        }
        else if(stringi.equals("2")) {
            return 2;
        }
        else if(stringi.equals("3")) {
            return 3;
        }else {
            System.out.println("Podaj prawidłowe dane!");
            return stringi_generator();
        }
    }

    public static int string_generator(){
        Scanner scanner = new Scanner(System.in);
        String stringi = scanner.nextLine();
        if(stringi.equals("a")) {
            return 1;
        }
        else if(stringi.equals("b")) {
            return 2;
        }
        else if(stringi.equals("c")) {
            return 3;
        }else {
            System.out.println("Podaj prawidłowe dane!");
            return string_generator();
        }
    }






    public static int scanner_Integer(){
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        if (scan==1||scan==2){
            return scan;

        } else {
            System.out.println("Error");
            return scanner_Integer();

        }
    }


    public static String scanner_String(){
        Scanner scanner = new Scanner(System.in);
        String navi = scanner.nextLine();
        return navi;
    }


    public static void gra() {
        String [][] gra = new String[4][4];
        char har='@';
        int tabliczka =1;
        String full = "";



        for(int i=0; i< gra.length; i++){
            for(int j=0; j< gra[i].length; j++){
                if (j==0){
                    gra[i][j]=String.valueOf(har);
                    har++;
                }else if (i==0){
                    gra[i][j]=Integer.toString(tabliczka);
                    tabliczka++;
                } else {
                    gra[i][j]=" ";
                }
            }}
        System.out.println(" Welcome to X/O game");
        System.out.println("");

        boolean loop = true;

        while(loop){


            ///wyswietlane

            System.out.println("");
            for(int i=0; i< gra.length; i++){
                for(int j=0; j< gra[i].length; j++){
                    if (i==0 && j==0){
                        System.out.print("     ");
                    }
                    else if (i==0|| j==0){
                        System.out.print("  "+gra[i][j]+"  ");

                    }

                    else {
                        System.out.print("[ "+gra[i][j]+" ]");
                    }
                }
                System.out.println();


            }




            System.out.println("player 1 move:");
            System.out.println("type co-ordinates (a-c)");
            do{
                System.out.print("y-");
                int y=string_generator();
                System.out.println("type co-ordinates (1-3)");
                System.out.print("x-");
                int x=stringi_generator();
                if (gra[y][x]==" "){
                    gra[y][x]="O";
                    break;
                }else{
                    if (y==1){
                        full = "a";
                    } else if (y==2){
                        full = "b";

                    } else {
                        full = "c";
                    }
                    System.out.println("");
                    System.out.println("The are '["+full+"]["+x+"]' is full!");
                    System.out.println("");
                }
            }while(true);



            // "/"pattern
            for(int i=1; i< gra.length; i++){
                if(gra[1][3]==gra[2][2]&&gra[1][3]==gra[3][1]){
                    if(gra[1][3]=="O"){

                        System.out.println("");


                        System.out.println("player 1 won");
                        for(int iw=0; iw< gra.length; iw++){
                            for(int j=0; j< gra[i].length; j++){
                                if (iw==0 && j==0){
                                    System.out.print("     ");
                                }
                                else if (iw==0|| j==0){
                                    System.out.print("  "+gra[iw][j]+"  ");

                                }

                                else {
                                    System.out.print("[ "+gra[iw][j]+" ]");
                                }
                            }
                            System.out.println();


                        }
                        System.exit(1);
                    }




                    else if(gra[1][3]=="X"){

                        System.out.println("");


                        System.out.println("player 2 won");
                        for(int ii=0; ii< gra.length; ii++){
                            for(int jj=0; jj< gra[ii].length; jj++){
                                if (ii==0 && jj==0){
                                    System.out.print("     ");
                                }
                                else if (ii==0|| jj==0){
                                    System.out.print("  "+gra[ii][jj]+"  ");

                                }

                                else {
                                    System.out.print("[ "+gra[ii][jj]+" ]");
                                }
                            }
                            System.out.println();


                        }
                        System.exit(1);
                    }

                }


                /// "\ pratterm"
                if(gra[1][1]==gra[2][2]&&gra[1][1]==gra[3][3]){
                    if(gra[1][1]=="O"){

                        System.out.println("");


                        System.out.println("player 1 won");
                        for(int ix=0; ix< gra.length; ix++){
                            for(int j=0; j< gra[ix].length; j++){
                                if (ix==0 && j==0){
                                    System.out.print("     ");
                                }
                                else if (ix==0|| j==0){
                                    System.out.print("  "+gra[ix][j]+"  ");

                                }

                                else {
                                    System.out.print("[ "+gra[ix][j]+" ]");
                                }
                            }
                            System.out.println();


                        }
                        System.exit(1);
                    }




                    else if(gra[1][1]=="X"){

                        System.out.println("");


                        System.out.println("player 2 won");
                        for(int ii=0; ii< gra.length; ii++){
                            for(int jj=0; jj< gra[ii].length; jj++){
                                if (ii==0 && jj==0){
                                    System.out.print("     ");
                                }
                                else if (ii==0|| jj==0){
                                    System.out.print("  "+gra[ii][jj]+"  ");

                                }

                                else {
                                    System.out.print("[ "+gra[ii][jj]+" ]");
                                }
                            }
                            System.out.println();


                        }
                        System.exit(1);
                    }

                }







                /// "| pattern"
                if (gra[1][i]==gra[2][i]&&gra[1][i]==gra[3][i]){
                    if(gra[1][i]=="O"){

                        System.out.println("");


                        System.out.println("player 1 won");
                        for(int x=0; x< gra.length; x++){
                            for(int j=0; j< gra[x].length; j++){
                                if (x==0 && j==0){
                                    System.out.print("     ");
                                }
                                else if (x==0|| j==0){
                                    System.out.print("  "+gra[x][j]+"  ");

                                }

                                else {
                                    System.out.print("[ "+gra[x][j]+" ]");
                                }
                            }
                            System.out.println();


                        }
                        System.exit(1);
                    }




                    else if(gra[1][i]=="X"){

                        System.out.println("");


                        System.out.println("player 2 won");
                        for(int ii=0; ii< gra.length; ii++){
                            for(int jj=0; jj< gra[ii].length; jj++){
                                if (ii==0 && jj==0){
                                    System.out.print("     ");
                                }
                                else if (ii==0|| jj==0){
                                    System.out.print("  "+gra[ii][jj]+"  ");

                                }

                                else {
                                    System.out.print("[ "+gra[ii][jj]+" ]");
                                }
                            }
                            System.out.println();


                        }
                        System.exit(1);
                    }
                }



                /// "--- pattern"

                if (gra[i][1]==gra[i][2]&&gra[i][1]==gra[i][3]){
                    if(gra[i][1]=="O"){

                        System.out.println("");


                        System.out.println("player 1 won");
                        for(int v=0; v< gra.length; v++){
                            for(int j=0; j< gra[v].length; j++){
                                if (v==0 && j==0){
                                    System.out.print("     ");
                                }
                                else if (v==0|| j==0){
                                    System.out.print("  "+gra[v][j]+"  ");

                                }

                                else {
                                    System.out.print("[ "+gra[v][j]+" ]");
                                }
                            }
                            System.out.println();


                        }
                        System.exit(1);
                    }




                    else if(gra[i][1]=="X"){

                        System.out.println("");


                        System.out.println("player 2 won");
                        for(int ii=0; ii< gra.length; ii++){
                            for(int jj=0; jj< gra[ii].length; jj++){
                                if (ii==0 && jj==0){
                                    System.out.print("     ");
                                }
                                else if (ii==0|| jj==0){
                                    System.out.print("  "+gra[ii][jj]+"  ");

                                }

                                else {
                                    System.out.print("[ "+gra[ii][jj]+" ]");
                                }
                            }
                            System.out.println();


                        }
                        System.exit(1);
                    }
                }
            }











            System.out.println("");
            for(int i=0; i< gra.length; i++){
                for(int j=0; j< gra[i].length; j++){
                    if (i==0 && j==0){
                        System.out.print("     ");
                    }
                    else if (i==0|| j==0){
                        System.out.print("  "+gra[i][j]+"  ");

                    }
                    else if (i==0|| j==0){
                        System.out.print("  "+gra[i][j]+"  ");

                    }
                    else {
                        System.out.print("[ "+gra[i][j]+" ]");
                    }
                }
                System.out.println();


            }
            System.out.println("player's 2 move:");
            System.out.println("type co-ordinates (a-c)");
            do{
                System.out.print("y-");
                int y=string_generator();
                System.out.println("type co-ordinates (1-3)");

                System.out.print("x-");
                int x=stringi_generator();
                if (gra[y][x]==" "){
                    gra[y][x]="X";
                    break;
                }else{
                    if (y==1){
                        full = "a";
                    } else if (y==2){
                        full = "b";

                    } else {
                        full = "c";
                    }
                    System.out.println("");
                    System.out.println("The are '["+full+"]["+x+"]' is full!");
                    System.out.println("");
                }
            }while(true);
            // "/"pattern
            for(int i=1; i< gra.length; i++){
                if(gra[1][3]==gra[2][2]&&gra[1][3]==gra[3][1]){
                    if(gra[1][3]=="O"){

                        System.out.println("");


                        System.out.println("player 1 won");
                        for(int b=0; b< gra.length; b++){
                            for(int j=0; j< gra[b].length; j++){
                                if (b==0 && j==0){
                                    System.out.print("     ");
                                }
                                else if (b==0|| j==0){
                                    System.out.print("  "+gra[b][j]+"  ");

                                }

                                else {
                                    System.out.print("[ "+gra[b][j]+" ]");
                                }
                            }
                            System.out.println();


                        }
                        System.exit(1);
                    }




                    else if(gra[1][3]=="X"){

                        System.out.println("");


                        System.out.println("player 2 won");
                        for(int ii=0; ii< gra.length; ii++){
                            for(int jj=0; jj< gra[ii].length; jj++){
                                if (ii==0 && jj==0){
                                    System.out.print("     ");
                                }
                                else if (ii==0|| jj==0){
                                    System.out.print("  "+gra[ii][jj]+"  ");

                                }

                                else {
                                    System.out.print("[ "+gra[ii][jj]+" ]");
                                }
                            }
                            System.out.println();


                        }
                        System.exit(1);
                    }

                }


                /// "\ pratterm"
                if(gra[1][1]==gra[2][2]&&gra[1][1]==gra[3][3]){
                    if(gra[1][1]=="O"){

                        System.out.println("");


                        System.out.println("player 1 won");
                        for(int n=0; n< gra.length; n++){
                            for(int j=0; j< gra[n].length; j++){
                                if (n==0 && j==0){
                                    System.out.print("     ");
                                }
                                else if (n==0|| j==0){
                                    System.out.print("  "+gra[n][j]+"  ");

                                }

                                else {
                                    System.out.print("[ "+gra[n][j]+" ]");
                                }
                            }
                            System.out.println();


                        }
                        System.exit(1);
                    }




                    else if(gra[1][1]=="X"){

                        System.out.println("");


                        System.out.println("player 2 won");
                        for(int ii=0; ii< gra.length; ii++){
                            for(int jj=0; jj< gra[ii].length; jj++){
                                if (ii==0 && jj==0){
                                    System.out.print("     ");
                                }
                                else if (ii==0|| jj==0){
                                    System.out.print("  "+gra[ii][jj]+"  ");

                                }

                                else {
                                    System.out.print("[ "+gra[ii][jj]+" ]");
                                }
                            }
                            System.out.println();


                        }
                        System.exit(1);
                    }

                }







                /// "| pattern"
                if (gra[1][i]==gra[2][i]&&gra[1][i]==gra[3][i]){
                    if(gra[1][i]=="O"){

                        System.out.println("");


                        System.out.println("player 1 won");
                        for(int q=0; q< gra.length; q++){
                            for(int j=0; j< gra[i].length; j++){
                                if (i==0 && j==0){
                                    System.out.print("     ");
                                }
                                else if (i==0|| j==0){
                                    System.out.print("  "+gra[i][j]+"  ");

                                }

                                else {
                                    System.out.print("[ "+gra[i][j]+" ]");
                                }
                            }
                            System.out.println();


                        }
                        System.exit(1);
                    }




                    else if(gra[1][i]=="X"){

                        System.out.println("");


                        System.out.println("player 2 won");
                        for(int ii=0; ii< gra.length; ii++){
                            for(int jj=0; jj< gra[ii].length; jj++){
                                if (ii==0 && jj==0){
                                    System.out.print("     ");
                                }
                                else if (ii==0|| jj==0){
                                    System.out.print("  "+gra[ii][jj]+"  ");

                                }

                                else {
                                    System.out.print("[ "+gra[ii][jj]+" ]");
                                }
                            }
                            System.out.println();


                        }
                        System.exit(1);
                    }
                }



                /// "--- pattern"

                if (gra[i][1]==gra[i][2]&&gra[i][1]==gra[i][3]){
                    if(gra[i][1]=="O"){

                        System.out.println("");


                        System.out.println("player 1 won");
                        for(int w=0; w< gra.length; w++){
                            for(int j=0; j< gra[w].length; j++){
                                if (w==0 && j==0){
                                    System.out.print("     ");
                                }
                                else if (w==0|| j==0){
                                    System.out.print("  "+gra[w][j]+"  ");

                                }

                                else {
                                    System.out.print("[ "+gra[w][j]+" ]");
                                }
                            }
                            System.out.println();


                        }
                        System.exit(1);
                    }




                    else if(gra[i][1]=="X"){

                        System.out.println("");


                        System.out.println("player 2 won");
                        for(int ii=0; ii< gra.length; ii++){
                            for(int jj=0; jj< gra[ii].length; jj++){
                                if (ii==0 && jj==0){
                                    System.out.print("     ");
                                }
                                else if (ii==0|| jj==0){
                                    System.out.print("  "+gra[ii][jj]+"  ");

                                }

                                else {
                                    System.out.print("[ "+gra[ii][jj]+" ]");
                                }
                            }
                            System.out.println();


                        }
                        System.exit(1);
                    }
                }
            }
        }

    }

    public static void main(String [] args){
        System.out.println("Welcome to X/O game");
        while (true){
            System.out.println("");
            System.out.println("Menu:");
            System.out.println("1 - New X/O game");
            System.out.println("2 - Exit");
            switch(scanner_Integer()){
                case 1:
                    gra();
                    break;
                case 2:
                    System.exit(1);
                    break;

            }


        }



    }

}