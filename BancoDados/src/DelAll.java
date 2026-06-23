public class DelAll implements Command {

    public Object execute(Object... args) throws Exception {
        
        Object[] objs = (Object[]) args;
        Object banco = objs[0];
        if (banco instanceof BancoPessoas) {
            BancoPessoas b = (BancoPessoas) banco;
            b.getPessoas().clear();
            return true;
        }else {
            throw new Exception("Argumentos inválidos para o comando DelAll");
        }
    }
    
}
