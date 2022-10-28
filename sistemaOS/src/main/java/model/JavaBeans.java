package model;

public class JavaBeans {
			String codigo;
			String data;
			String descricao;
			String cliente;
			String veiculo;
			
			public JavaBeans() {
				super();
			}

			public JavaBeans(String codigo, String data, String descricao, String cliente, String veiculo) {
				super();
				this.codigo = codigo;
				this.data = data;
				this.descricao = descricao;
				this.cliente = cliente;
				this.veiculo = veiculo;
			}

			public String getCodigo() {
				return codigo;
			}

			public void setCodigo(String codigo) {
				this.codigo = codigo;
			}

			public String getData() {
				return data;
			}

			public void setData(String data) {
				this.data = data;
			}

			public String getDescricao() {
				return descricao;
			}

			public void setDescricao(String descricao) {
				this.descricao = descricao;
			}

			public String getCliente() {
				return cliente;
			}

			public void setCliente(String cliente) {
				this.cliente = cliente;
			}

			public String getVeiculo() {
				return veiculo;
			}

			public void setVeiculo(String veiculo) {
				this.veiculo = veiculo;
			}
			
			
			
}
