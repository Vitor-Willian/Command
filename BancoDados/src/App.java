public class App {
    public static void main(String[] args) throws Exception {
        BancoPessoas banco = new BancoPessoas();
        
        banco.service("new", banco, 1, "João");

    }
}
