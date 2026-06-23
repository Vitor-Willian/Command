import java.util.HashMap;

public class BancoPessoas {
    private HashMap<Integer, Pessoa> pessoas;
    private HashMap<String, Command> commands;

    public BancoPessoas() {
        initCommands();
    }

    private void initCommands() {
        commands = new HashMap<>();
        // commands.put(1, new AdicionarPessoaCommand(this));
        // commands.put(2, new RemoverPessoaCommand(this));
        // commands.put(3, new ListarPessoasCommand(this));
    }

    public void service(String cmd, Object data) throws Exception {

        if(!commands.containsKey(cmd)) {
            throw new Exception("Comando inválido: " + cmd);
        }

        Command c = (Command) commands.get(cmd);
        Object result = c.execute(data);
    }

    public HashMap<Integer, Pessoa> getPessoas() {
        return pessoas;
    }

    public HashMap<String, Command> getCommands() {
        return commands;
    }
}
