package flying;

// Implementação do comportamento de voo para patos que NÃO voam (como patos de borracha e patos-isca). [cite: 32]
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly"); // [cite: 31]
    }
}