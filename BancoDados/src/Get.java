public class Get implements Command {
    
    public Object execute(Object... args) throws Exception {
        Object banco = args[0];
        Object id = args[1];

        if (banco instanceof BancoPessoas && id instanceof Integer) {
            BancoPessoas b = (BancoPessoas) banco;
            Integer i = (Integer) id;

            Pessoa pessoa = b.getPessoas().get(i);
            if (pessoa != null) {
                System.out.println("ID: " + pessoa.getId() + ", Nome: " + pessoa.getNome());
                return pessoa;
            } else {
                throw new Exception("Pessoa não encontrada com ID: " + i);
            }
            
        } else {
            throw new Exception("Argumento inválido para o comando Get");
        }
    }
}
