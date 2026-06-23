public class New implements Command {

    public Object execute(Object... args) throws Exception {
        
        Object[] objs = (Object[]) args;
        Object banco = objs[0];
        Object id = objs[1];
        Object nome = objs[2];
        if (banco instanceof BancoPessoas && id instanceof Integer && nome instanceof String) {
            BancoPessoas b = (BancoPessoas) banco;
            Integer pessoaId = (Integer) id;
            String pessoaNome = (String) nome;
            Pessoa p = new Pessoa(pessoaId, pessoaNome);
            b.getPessoas().put(p.getId(), p);
            return true;
        }else {
            throw new Exception("Argumentos inválidos para o comando New");
        }
    }   
    
    
}
