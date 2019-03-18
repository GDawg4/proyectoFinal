import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Andrea
 */
public class ProyectoADT {

    /**
     * @param args the command line arguments
     */

    public static Number process(String command){
        Lisp lisp = new Lisp("");
        boolean noerror = false;
        int fun = 0;
        int condicion = 0;
        int myturn = 0;

        List<Integer> index1 = new ArrayList(1);
        List<Integer> index2 = new ArrayList(1);
        String opss = "";
        String param = "";
        String funName = "";
        fun = lisp.function(command, noerror, funName);

        if(lisp.isCorrect(command)){
            System.out.println("yay");
            if(fun == 1){
                noerror = true;
                return (lisp.suma(command));

            }
            if(fun == 2){

                return (lisp.resta(command));

            }
            if(fun == 3){
                noerror = true;
                return (lisp.mult(command));

            }
            if(fun == 4){
                if(lisp.canDiv(command)){
                    noerror = true;
                    return (lisp.div(command));

                }
                else{
                    System.out.println("Solo se aceptan dos parametros en division");
                }

            }
            if(fun == 6 && myturn ==1) {
                System.out.println(lisp.defun(command,index1,index2,opss,param));
                return 4001;
            }
            if(fun == 5){
                System.out.println("yay 2");
                index1 = lisp.getIndex1(command);
                index2 = lisp.getIndex2(command);
                funName = lisp.getname(command);
                opss = lisp.getOp(command);
                param = lisp.getparam(command);
                myturn = 1;
                return 4002;
            }
            if(fun == 7){
                System.out.println(lisp.condicional(command));
            }
            if(fun == 8){
               return process(command);
            }
        }
        else{
            System.out.println("La funcion indicada no es correcta");
        }
        return 4003;
    }


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int condicion = 0;
        List<Integer> index1 = new ArrayList(1);
        List<Integer> index2 = new ArrayList(1);
        String opss = "";
        String param = "";
        String funName = "";

        String command = "";
        int fun = 0;
        boolean noerror = false; //variable that prevents function crash
        int myturn = 0;
        Stack<Integer> startingPositions = new Stack<>();
        Stack<Integer> finalPositions = new Stack<>();

        while(condicion == 0){
            System.out.println("Ingrese comando a ejectutar en LISP: " +funName); //user is requested to put an operation
            command = keyboard.nextLine();

            for (int i = 0; i < command.length(); i ++){
                if (command.charAt(i) == '('){
                    startingPositions.push(i);

                } else if (command.charAt(i) == ')') {
                    int finalFinal = startingPositions.pop();
                }
            }

            StringBuilder test = new StringBuilder();


            System.out.println("presione 0 para continuar,pulse 1 para salir...");
            //condicion = keyboard.nextInt();
            //keyboard.nextLine();
        }

    }

}
