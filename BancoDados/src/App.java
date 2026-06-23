public class App {
    public static void main(String[] args) throws Exception {
        BancoPessoas banco = new BancoPessoas();
        
        banco.service("new", banco, 1, "João");
        banco.service("new", banco, 2, "Marcos");
        banco.service("get", banco, 1);
        banco.service("getall", banco);

    }
}
