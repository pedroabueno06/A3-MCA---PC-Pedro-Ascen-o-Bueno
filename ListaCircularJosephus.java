public class ListaCircularJosephus {
    private no cabeca = null;
    
    //Lista circular com N participantes
    public void ListaCircular(int Nparticipantes) {
        if (Nparticipantes >= 1) {
            no anterior = null;

            for (int i = 1; i <= Nparticipantes; i++) {
                no novo = new no(i);

                if (cabeca == null) {
                    cabeca = novo;
                    
                } else {
                    anterior.prox = novo;
                }
                
                anterior = novo;

            }
            //Fechando lista circular
            anterior.prox = cabeca;
        } else {
            System.out.println("N inválido");
        }
    }

    //Teórema de Josephus
    public int teorema(int Keliminado) {
        if (Keliminado < 1) {
            System.out.println("K inválido");
            
        }

        no atual = cabeca;
        no anterior = null;

        while (atual.prox != atual) {
            
            //k-1 para determinar o próximo eliminado
            for (int i = 1; i < Keliminado; i++) {
                anterior = atual;
                atual = atual.prox;
            }

            //Eliminando nó atual
            anterior.prox = atual.prox;
            System.out.println("Participante eliminando: " + atual.id);

            //Avançando para o próximo nó
            atual = atual.prox;
        }
        
        return atual.id;
    }
}      