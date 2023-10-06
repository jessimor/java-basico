public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        /* 
        if(plano =="B"){
            System.out.println("100 min de ligação");
        }else if (plano == "M"){
            System.out.println("100 min de ligação");
            System.out.println("Whats e Insta grátis");
        }else if(plano == "T"){
            System.out.println("100 min de ligação");
            System.out.println("Whats e Insta grátis");
            System.out.println("Youtube");
        }
        */

        switch (plano){
            case "T":{
                System.out.println("Youtube");
            }
            case "M":{
                System.out.println("Whats e Insta grátis");
            }
            case "B":{
                System.out.println("100 min de ligação");
            }
        }
    }
}
