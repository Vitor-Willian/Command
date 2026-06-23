public class Del implements Command {

    public Object execute(Object... args) throws Exception {
        
        Object[] objs = (Object[]) args;
        Object banco = objs[0];
        Object id = objs[1];
        if (banco instanceof BancoPessoas && id instanceof Integer) {
            BancoPessoas b = (BancoPessoas) banco;
            Integer pessoaId = (Integer) id;
            b.getPessoas().remove(pessoaId);
            return true;
        }else {
            throw new Exception("Argumentos inválidos para o comando Del");
        }
    }
    
}
