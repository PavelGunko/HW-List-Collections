

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        List<String> product = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите одну из операций:");
            System.out.println("1 - Добавить;\n2 - Показать;\n3 - Удалить.");
            String chooseAnOperation = scanner.next();

            switch (chooseAnOperation) {
                case ("1"): {
                    System.out.println("Какую покупку хотите добавить?");
                    String products = scanner.next();
                    product.add(products);
                    System.out.printf("%s\nИтого в списке покупок: %d\n", products, product.size());
                    break;
                }
                case ("2"): {
                    System.out.println("Ваш список покупок:");
                    print(product);

                    break;
                }
                case ("3"): {
                    //System.out.println("Список покупок:");
                    System.out.println(" Какую покупку хотите удалить? Введите номер или название");
                    String action = scanner.next();
                    if (checkOperations(action)) {
                        product.remove(Integer.parseInt(action) - 1);
                    }
                    product.remove(action);
                    System.out.printf("Покупка %s, удалена список покупок:\n", action);
                    print(product);
                    break;
                }
            }
        }
    }

    public static void print(List<String> product) {
        for (int i = 0; i < product.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, product.get(i));
        }

    }

    private static boolean checkOperations(String action) {
        try {
            Integer.parseInt(action);
            return true;

        } catch (NumberFormatException с) {
            return false;
        }

    }


}

