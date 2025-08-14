import java.util.Scanner;

public class CalculadoraAlpha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora Alpha ===");

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Raiz Quadrada");
            System.out.println("6 - Descobrir Signo Zodiacal");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo... Obrigado!");
                break;
            }

            switch (opcao) {
                case 1: // soma
                    System.out.print("Informe o primeiro número: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Informe o segundo número: ");
                    double num2 = sc.nextDouble();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case 2: // subtração
                    System.out.print("Informe o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Informe o segundo número: ");
                    num2 = sc.nextDouble();
                    System.out.println("Resultado: " + (num1 - num2));
                    break;

                case 3: // multiplicação
                    System.out.print("Informe o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Informe o segundo número: ");
                    num2 = sc.nextDouble();
                    System.out.println("Resultado: " + (num1 * num2));
                    break;

                case 4: // divisão
                    System.out.print("Informe o dividendo: ");
                    num1 = sc.nextDouble();
                    System.out.print("Informe o divisor: ");
                    num2 = sc.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    } else {
                        System.out.println("Resultado: " + (num1 / num2));
                    }
                    break;

                case 5: // raiz quadrada
                    System.out.print("Informe o número para raiz quadrada: ");
                    num1 = sc.nextDouble();
                    if (num1 < 0) {
                        System.out.println("Erro: Número negativo não tem raiz quadrada real.");
                    } else {
                        System.out.println("Resultado: " + Math.sqrt(num1));
                    }
                    break;

                case 6: // signo zodiacal
                    System.out.print("Informe o dia do nascimento: ");
                    int dia = sc.nextInt();
                    System.out.print("Informe o mês do nascimento (1-12): ");
                    int mes = sc.nextInt();

                    String signo = calcularSigno(dia, mes);
                    if (signo != null) {
                        System.out.println("Seu signo é: " + signo);
                    } else {
                        System.out.println("Data inválida.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

        sc.close();
    }

    private static String calcularSigno(int dia, int mes) {
        if (mes < 1 || mes > 12 || dia < 1) {
            return null;
        }

        int maxDia;
        switch (mes) {
            case 2: maxDia = 29; break; // simplificação: aceita até 29 (não verifica ano bissexto)
            case 4: case 6: case 9: case 11: maxDia = 30; break;
            default: maxDia = 31;
        }
        if (dia > maxDia) {
            return null;
        }

        if (mes == 1) {
            if (dia >= 20) return "Aquário";
            else return "Capricórnio";
        } else if (mes == 2) {
            if (dia <= 18) return "Aquário";
            else return "Peixes";
        } else if (mes == 3) {
            if (dia <= 20) return "Peixes";
            else return "Áries";
        } else if (mes == 4) {
            if (dia <= 19) return "Áries";
            else return "Touro";
        } else if (mes == 5) {
            if (dia <= 20) return "Touro";
            else return "Gêmeos";
        } else if (mes == 6) {
            if (dia <= 20) return "Gêmeos";
            else return "Câncer";
        } else if (mes == 7) {
            if (dia <= 22) return "Câncer";
            else return "Leão";
        } else if (mes == 8) {
            if (dia <= 22) return "Leão";
            else return "Virgem";
        } else if (mes == 9) {
            if (dia <= 22) return "Virgem";
            else return "Libra";
        } else if (mes == 10) {
            if (dia <= 22) return "Libra";
            else return "Escorpião";
        } else if (mes == 11) {
            if (dia <= 21) return "Escorpião";
            else return "Sagitário";
        } else if (mes == 12) {
            if (dia <= 21) return "Sagitário";
            else return "Capricórnio";
        }

        return null;
    }
}
