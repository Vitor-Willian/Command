public class New implements Command {

    public Object execute(Object... args) throws Exception {
        
        Object[] objs = (Object[]) args;
        Object banco = objs[0];
        Object pessoa = objs[1];
        if (banco instanceof BancoPessoas && pessoa instanceof Pessoa) {
            BancoPessoas b = (BancoPessoas) banco;
            Pessoa p = (Pessoa) pessoa;
            b.getPessoas().put(p.getId(), p);
            return true;
        }else {
            throw new Exception("Argumentos inválidos para o comando New");
        }
    }   
    
    
}
