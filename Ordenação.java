class Ordenação 
{
 
    public static void main(String[] args) 
    {

        int vetor[] = {3,11, -5, 14, -16, 0, 25, 4, -1, -7, 8, 15, 6, -10};
        int aux;
        boolean controle;

        for(int i = 0; i < vetor.length; ++i)
        {
            controle = true;
            for(int j = 0; j < (vetor.length - 1); ++j)
            {

                if(vetor[j] > vetor[j + 1])
                {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    controle = false;
                }
            }
            if(controle)
            {
                break;
            }

        }

            for (int i = 0; i < vetor.length; ++i) 
            {
                System.out.print(vetor[i] + " ");
            }
            
            System.out.println("");
            System.out.println("");

    }
}

