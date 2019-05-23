import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sysos.dao.JPAUtil;
import br.com.sysos.model.OS;

public class GerandoBanco {

	public static void main(String[] args) {
//		EntityManagerFactory factory = Persistence
//				.createEntityManagerFactory("bdmysql");
//		EntityManager manager = factory.createEntityManager();
		
		EntityManager em = new JPAUtil().getEntityManager();
		
//		manager.getTransaction().begin();
		
		
//		Produto produto = new Produto();
//		produto.setDescricao("Produto teste 4");
//		
//		Produto produto1 = new Produto();
//		produto1.setDescricao("Produto teste 5");
//		
//		OS os = new OS();
//		os.setDescricao("OS - TESTE 5");
//		
//		os.getSetProdutos().add(produto);
//		os.getSetProdutos().add(produto1);

		
//		List<OS> listaOs = manager.createQuery("select o from OS o").getResultList();
//		System.out.println(listaOs);
//		
//		manager.getTransaction().begin();
//		
//		OS os = manager.find(OS.class, 3L);
//		System.out.println(os);
//		
//		manager.remove(os);
//		
////		manager.persist(os);
//		manager.getTransaction().commit();
		
		
	}
	
}
