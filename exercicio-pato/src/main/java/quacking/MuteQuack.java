package quacking;

// Não faça nada - não pode grasnar [cite: 69, 70]
public class MuteQuack implements QuackBehavior {
    public void quack() {
        // Não faz nada (silêncio)
        System.out.println("<< Silence >>");
    }
}