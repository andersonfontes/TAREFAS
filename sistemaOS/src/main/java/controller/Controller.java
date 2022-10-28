package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet = urlPatterns("/Controller","main",
		 "/cadastrarOS", "/cadastrarVaga", "/oss")

public class Controller
		extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();

	public Controller() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	//CRUD CREATE (SERVLET)
	public void criarOS(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//este metodo ira receber os dados dos campos do form da tela e enviar para a classe dao responsavel pela gravação deste novo registro no BD
	}
	
	//CRUD READ(SERVLET) (****** atenção pois é array list ******)
	public ArrayList<JavaBeans> listarOS(){
		
	}
	ArrayList<JavaBeans> 
		
		//recebe os dados (vetor dinamico) da classe DAO que fez o select no registro e envia os dados 
		
	}
	
	//CRUD READ(SERVLET)
	public void lerOS(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//envia o ID selecionado para as classes DAO que irao fazer o select naquele registro e retornar os dados para que o servlet trazer os campos para a edição na tela
		
	}
	
	//CRUD UPDATE(SERVLET)
	public void alterarOS(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//envia os dados da tela para a classe DAO que ira fazer o update no BD
	
	}
	
	//CRUD DELETE(SERVLET)
	public void excluirOS(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//envia o ID selecionado para a classe DAO que ira fazer a exclusao no BD
	}
}
