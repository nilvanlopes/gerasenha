package library;

import java.util.Random;

/**
 *
 * @author N354763
 */
public class GeneratePassword {
    StringBuilder pass;
    String min;
    String maius;
    String num;
    String sim;
    
    public GeneratePassword(){
        pass = new StringBuilder("00000000");
        min = new String("abcdefghijklmnopqrstuvwxyz");
        maius = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        num = new String("0123456789");
        sim = new String("@#$%");
        int cont=4;
        int gate=0;
        int aux=0;
        int aux2=0;
        char x;
        Random r  = new Random();
        aux=r.nextInt(24);
        pass.setCharAt(0,min.charAt(aux));
        aux=r.nextInt(24);
        pass.setCharAt(1,maius.charAt(aux));
         aux=r.nextInt(9);
        pass.setCharAt(2,num.charAt(aux));
        aux=r.nextInt(3);
        pass.setCharAt(3,sim.charAt(aux));
        while (cont<8){
            gate = r.nextInt(3);
            if(gate==1){
                aux=r.nextInt(25);
                pass.setCharAt(cont,min.charAt(aux));
            }
            if(gate==2){
                aux=r.nextInt(25);
                pass.setCharAt(cont,maius.charAt(aux));
            }
            if(gate==3){
                aux=r.nextInt(10);
                pass.setCharAt(cont,num.charAt(aux));
            }
            if(gate==4){
                aux=r.nextInt(4);
                pass.setCharAt(cont,sim.charAt(aux));
            }
            cont++;
        }
        for (int i = 0; i < 30; i++) {
                aux=r.nextInt(8);
                aux2=r.nextInt(8);
                x=pass.charAt(aux);
                pass.setCharAt(aux, pass.charAt(aux2));
                pass.setCharAt(aux2, x);
            }
    }

    public StringBuilder getPass() {
        return pass;
    }
}
