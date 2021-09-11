class Main {

    public static void analisa(int i) throws Egeral {
        if(i < 0) {
            throw new Ecaminho();
        }
        if(i == 0) {
            throw new Erecurso();
        }
        if(i == 9) {
            throw new Egeral();
        }
    }


    public static void main(String[] args) {
        try {
            int c = -2;
            try {
                analisa(c);

            } catch(Erecurso a) {
                System.out.println("Recurso!");
            } /* catch(Emovimento s) {
                System.out.println("Move!");
            }  */catch(Ecaminho x) {
                System.out.println("Caminho!");
            } catch(Egeral a) {
                System.out.println("Geral");
            }
            
            c = 9;
            analisa(c);
            } catch(Ecaminho a) {
                System.out.println("Caminho!");
            } catch(Emovimento s) {
                System.out.println("Move!");
            } catch(Erecurso a) {
                System.out.println("Recurso!");
            } catch(Exception a) {
                System.out.println("Excecao!");
            }
        }
}
