public class MainConjunto {
    public static void main(String[] args) {
    
        Conjunto a = new Conjunto();
        Conjunto b = new Conjunto();

        a.adicionar("Ana");
        a.adicionar("Bruno");
        a.adicionar("Carlos");

        b.adicionar("Bruno");
        b.adicionar("Diana");
        b.adicionar("Eduardo");

        System.out.println("Conjunto A:");
        a.mostrar();

        System.out.println("Conjunto B:");
        b.mostrar();

        System.out.println("Bruno pertence a A? "
                + a.pertence("Bruno"));

        System.out.println("Uniao de A e B:");
        a.uniao(b).mostrar();

        System.out.println("Intersecao de A e B:");
        a.inter(b).mostrar();

        System.out.println("A menos B:");
        a.menos(b).mostrar();

        System.out.println("Tentando adicionar Ana novamente:");
        System.out.println(a.adicionar("Ana"));
    }

}
