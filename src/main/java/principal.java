import model.Pessoa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;


public class principal {
    public static void main(String[] args) {

       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("moderna");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Pessoa pessoa = new Pessoa();
        pessoa.setId(1l);
        pessoa.setNome("Lara");
        pessoa.setCpf("852");

        Pessoa pessoa2 = new Pessoa();
        pessoa.setId(2l);
        pessoa2.setNome("Marcos");
        pessoa2.setCpf("321");

        Pessoa pessoa3 = new Pessoa();
        pessoa.setId(3l);
        pessoa3.setNome("Daniel");
        pessoa3.setCpf("456");

        Pessoa pessoa4 = new Pessoa();
        pessoa.setId(4l);
        pessoa4.setNome("Miguel");
        pessoa4.setCpf("789");

        Pessoa pessoa5 = new Pessoa();
        pessoa.setId(5l);
        pessoa5.setNome("Miguel");
        pessoa5.setCpf("963");

        String sql = "from Pessoa";
        TypedQuery<Pessoa> typedQuery = entityManager.createQuery(sql,Pessoa.class);
        List<Pessoa> listaDePessoas = typedQuery.getResultList();

        //System.out.println(listaDePessoas);

        int i = 1;
        for (Pessoa pessoaPercorrida : listaDePessoas){
            System.out.println(pessoaPercorrida);
            System.out.println(i++);
        }

        //abrir uma sessão do banco de dados
        entityManager.getTransaction().begin();

        //Pessoa pessoaEncontrada = entityManager.find(Pessoa.class,30l);
        //entityManager.remove(pessoaEncontrada);

        //entityManager.persist(pessoa5);
        //entityManager.merge(pessoa);
        //fecou a sessao do banco de dados
        //marge verificar se a pessoa existe para alteração se não exist alterar

        entityManager.getTransaction().commit();
        //fechar a sessão
        entityManager.clear();
        entityManagerFactory.close();

    }
}
