public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "A";
        /*
        if (sigla == "P")
        System.out.println("PEQUENO");
        else if (sigla == "M")
        System.out.println("MEDIO");
        else if (sigla == "G")
        System.out.println("GRANDE");
        else
        System.out.println("INDEFINIDO");
        */


    //switch não consegue ser mais performatico em nivel de sintaxe e complexidade do que um if tradicional

        switch (sigla){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Medio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
            System.out.println("Indefinido");
     
    }
    }
}
