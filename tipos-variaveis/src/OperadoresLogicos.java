public class OperadoresLogicos {

    public static void main(String[] args) {

        boolean condicaoUm, condicaodois;

        condicaoUm = true;
        condicaodois = false;

        if(condicaoUm && (7 >4)){
            System.out.println("As duas concições são verdadeiras");
        }


        if(condicaoUm && condicaodois){
            System.out.println("As duas concições são verdadeiras");
        }

        if(condicaoUm || condicaodois){
            System.out.println("Uma das concições são verdadeiras");
        }


        System.out.println("fim");

    }
}

