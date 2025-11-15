package com.icodi.dpstrategie;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        Map<String, IStrategy> strategiesMap = new HashMap<>();
        IStrategy strategy;
        while (true) {
            System.out.println("Entrez une stratégie : ");
            String strategyName = scanner.nextLine();
            strategy = strategiesMap.get(strategyName);
            if (strategy == null) {
                System.out.println(" *** CREATION D'UN NOUVEL OBJET DE StrategyImpl" + strategyName + " ***");
                strategy = (IStrategy) Class.forName("com.icodi.dpstrategie.StrategieImpl"+strategyName).getConstructor().newInstance();
                strategiesMap.put(strategyName, strategy);
            }

            context.setStrategy(strategy);
            context.effectuerOperation();

        }

    }
}
