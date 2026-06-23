public class App {
    public static void main(String[] args) throws Exception {
        BancoPessoas banco = new BancoPessoas();
        
        banco.service("new", banco, 1, "João");
        banco.service("new", banco, 2, "Marcos");
        banco.service("new", banco, 3, "Ana");
        banco.service("new", banco, 4, "Felipe");
        banco.service("get", banco, 1);
        System.out.println("\n");
        banco.service("getall", banco);
        System.out.println("\n");
        banco.service("del", banco, 2);
        banco.service("getall", banco);
        System.out.println("\n");
        banco.service("delall", banco);
        banco.service("getall", banco);

    }
}
