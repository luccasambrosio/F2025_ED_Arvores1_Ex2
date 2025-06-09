import br.edu.fateczl.Arvore;

public class App2 {
    public static void main(String[] args) throws Exception {
        
        int vetor[] = {33, 15, 41, 38, 47, 34, 49, 43};
        Arvore tree = new Arvore();
        
        for(int i = 0; i < vetor.length ; i++){
            tree.insert(vetor[i]);
        }

        tree.remove(33);

        tree.prefixSearch();
        System.out.println();
        tree.infixSearch();
        System.out.println();
        tree.posfixSearch();
    }
}
