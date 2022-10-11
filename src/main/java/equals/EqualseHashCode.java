package equals;

public class EqualseHashCode {
    public static void main(String[] args) {

        Usuario u1=new Usuario();
        u1.nome="Francis Alves";
        u1.email="francis@email.com";

        Usuario u2=new Usuario();
        u2.nome="Francis Alves";
        u2.email="francis@email.com";

        System.out.println(u1==u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        System.out.println(u1==u1);



    }
}
