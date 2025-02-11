package test;

public class Test {
    public static void main(String[] args) {
        // Créez une instance de la classe à tester
        MyClass myObject = new MyClass();

        // Appelez une méthode de la classe et affichez le résultat
        int result = myObject.add(5, 3);
        System.out.println("Le résultat de l'addition est : " + result);

        // Ajoutez d'autres tests si nécessaire
    }
}

class MyClass {
    // Exemple de méthode à tester
    public int add(int a, int b) {
        return a + b;
    }
}