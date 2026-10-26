public class MEDIA {

    /**
     * @param args the command line arguments
  */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nota1=0;
        System.out.println("Introduce una nota :");
        nota1 = sc.nextInt();
        int nota2=0;
        System.out.println("Introduce otra nota:");
        nota2 = sc.nextInt();
        int nota3=0;
        System.out.println("Introduce otra nota:");
        nota3 = sc.nextInt();
        double media= ((nota1+nota2+nota3)/3);
        if(media<5){
            System.out.println("SUSPENSO");
        }else if(media==5||media==6){
            System.out.println("APROBADO");
        }else if(media==7||media==8){
            System.out.println("Notable");
        }else if(media==9||media==10){
            System.out.println("Sobresaliente");
            
        }
        
        
    }
    
}
