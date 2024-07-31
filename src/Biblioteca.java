import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private ArrayList<Livro> myList = new ArrayList<Livro>();


    public void adicionarLivro(Livro l1){
        myList.add(l1);
    }
    public void removerLivro(String nomeLivro){
        for (int indice = 0; indice < myList.size() ; indice++) {
            Livro livro = myList.get(indice);

            if(nomeLivro.equals(livro.getNome())){
                myList.remove(indice);
                System.out.println("Livro "+nomeLivro+ " removido");
            }
            //if (nomeLivro == myList.get(i).getNome());
        }
        //myList.remove(l1);
    }
    public void listarLivros(){
        for (int indice = 0; indice < myList.size() ; indice++){
            Livro l1 = myList.get(indice);
            String nomeLivro = l1.getNome();
            String nomeAutor = l1.getAutor();
            System.out.println(nomeLivro +", " +nomeAutor);
        }
}
}

