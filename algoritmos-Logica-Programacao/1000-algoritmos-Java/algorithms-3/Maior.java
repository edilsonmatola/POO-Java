
//Salva os dados no BD
public void InserirDados() {
try {
// * Drive Conector MySQL.
Class.forName("com.mysql.jdbc.Driver");

// * Conexão como BD.
Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost/BDCadastro", "root", "210712");

// * Objeto comdo SQL.
Statement stmt = con.createStatement();

// * Pega os dados informado no formulário,
int cadMat = Integer.parseInt(entCodigo.getText());
String cadNome = entNome.getText();
String cadCPF = entCPF.getText();
String cadTelefone = entTelefone.getText();
String cadLogradouro = entLogradouro.getText();
int cadNumero = Integer.parseInt(entNumero.getText());
String cadBairro = entBairro.getText();
String cadCidade = entCidade.getText();
String cadEstado = entEstado.getText();

// * Insere os dados do formulário no BD.
stmt.executeUpdate("insert into TabFicha (Matricula, Nome, CPF, Telefone, Logradouro, Numero, Bairro, Cidade, Estado) values ('"
+ cadMat
+ "','"
+ cadNome
+ "','"
+ cadCPF
+ "','"
+ cadTelefone
+ "','"
+ cadLogradouro
+ "','"
+ cadNumero
+ "','"
+ cadBairro
+ "','"
+ cadCidade
+ "','"
+ cadEstado
+ "')");
JOptionPane.showMessageDialog(null, "Dados Salvos!");

limpaCampos();

// * Fecha a conexão do o DB.
con.close();

} catch (SQLException Erro) {
JOptionPane.showMessageDialog(null,
"Erro Cmdo SQL" + Erro.getMessage());

// Trata erros de conexão.
} catch (ClassNotFoundException Erro) {

JOptionPane.showMessageDialog(null, "Driver não encontrado!");

}
}

	
//Salva os dados no BD
public void InserirDados() {
try {
// * Drive Conector MySQL.
Class.forName("com.mysql.jdbc.Driver");
 
// * Conexão como BD.
Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost/BDCadastro", "root", "210712");
 
// * Objeto comdo SQL.
Statement stmt = con.createStatement();
 
// * Pega os dados informado no formulário,
int cadMat = Integer.parseInt(entCodigo.getText());
String cadNome = entNome.getText();
String cadCPF = entCPF.getText();
String cadTelefone = entTelefone.getText();
String cadLogradouro = entLogradouro.getText();
int cadNumero = Integer.parseInt(entNumero.getText());
String cadBairro = entBairro.getText();
String cadCidade = entCidade.getText();
String cadEstado = entEstado.getText();
 
// * Insere os dados do formulário no BD.
stmt.executeUpdate("insert into TabFicha (Matricula, Nome, CPF, Telefone, Logradouro, Numero, Bairro, Cidade, Estado) values ('"
+ cadMat
+ "','"
+ cadNome
+ "','"
+ cadCPF
+ "','"
+ cadTelefone
+ "','"
+ cadLogradouro
+ "','"
+ cadNumero
+ "','"
+ cadBairro
+ "','"
+ cadCidade
+ "','"
+ cadEstado
+ "')");
JOptionPane.showMessageDialog(null, "Dados Salvos!");
 
limpaCampos();
 
// * Fecha a conexão do o DB.
con.close();
 
} catch (SQLException Erro) {
JOptionPane.showMessageDialog(null,
"Erro Cmdo SQL" + Erro.getMessage());
 
// Trata erros de conexão.
} catch (ClassNotFoundException Erro) {
 
JOptionPane.showMessageDialog(null, "Driver não encontrado!");
 
}
}