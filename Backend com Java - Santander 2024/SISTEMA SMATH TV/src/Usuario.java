public class Usuario {
    public static void main(String[] args) throws Exception {

       SmathTv smathTv = new SmathTv();
 
       System.out.println("TV ligada ? " + smathTv.ligada);
       System.out.println("Canal atual : " + smathTv.canal);
       System.out.println("Volume atual : " + smathTv.volume);

       smathTv.ligar();
       System.out.println("Novo status -> TV ligada ? " + smathTv.ligada);
    }
}
