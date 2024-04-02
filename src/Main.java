public class Main {
    public static void main(String[] args) {
        // Crear 5 estudiantes distintos
        for (int i = 1; i <= 5; i++){
            Student student = new Student("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");

            // Imprimir estudiantes
            System.out.println(student);
        }
    }
}
