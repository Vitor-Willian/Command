public class Get implements Command {
    
    public Object execute(Object args) throws Exception {
        if (args instanceof BancoPessoas) {
            
            BancoPessoas banco = (BancoPessoas) args;

            for (Pessoa pessoa : banco.getPessoas().values()) {
                System.out.println("ID: " + pessoa.getId() + ", Nome: " + pessoa.getNome());
            }

            return banco.getPessoas();
            
        } else {
            throw new Exception("Argumento inválido para o comando Get");
        }
    }
}
