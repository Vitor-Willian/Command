public class Get implements Command {
    
    public Object execute(Object... args) throws Exception {
        Object arg = args[0];
        if (arg instanceof BancoPessoas) {
            
            BancoPessoas banco = (BancoPessoas) arg;

            for (Pessoa pessoa : banco.getPessoas().values()) {
                System.out.println("ID: " + pessoa.getId() + ", Nome: " + pessoa.getNome());
            }

            return banco.getPessoas();
            
        } else {
            throw new Exception("Argumento inválido para o comando Get");
        }
    }
}
