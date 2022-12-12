package pe.gob.loayza;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pe.estec.model.Catalogo;

@SpringBootApplication
public class HnalTesoreriaApplication implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate dao;

	public static void main(String[] args) {
		SpringApplication.run(HnalTesoreriaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		String sql = " select id_parametro, id_tipo_parametro, descripcion,codigo_area from test.dbo.parametro"; 
		try {
			List<Parametros> parametros = 
					dao.query(sql, BeanPropertyRowMapper.newInstance(Parametros.class));			
			catalogo.forEach(System.out :: println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
