package calculadoras;

import java.util.Scanner;
    public class Calculadora {

        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int opt = 0;
            int total = 0;

            System.out.println("___Calculadora___");

            do {
                System.out.println("Digite 1 para continuar");
                System.out.println("Digite 0 para finalizar");
                System.out.println("Qualquer outro Número sera invalido");
                if (opt != 0 && opt != 1) {
                    System.out.println("Este número é invalido, selecione entre 1 ou 0");
                }

                System.out.print("Escolha uma opção: ");
                opt = Integer.parseInt(ler.nextLine());
                if (opt == 1) {
                    System.out.println("___CATEGORIAS___");
                    System.out.println("Digite 1 para geometria");
                    System.out.println("Digite 2 para calculo");
                    System.out.println("Digite 3 para financeiro");
                    System.out.print("Escolha uma opção: ");
                    int categoria = Integer.parseInt(ler.nextLine());
                    if (categoria == 1) {
                        System.out.println("___GEOMETRIA___");
                        System.out.println("Digite 1 para area do triangulo");
                        System.out.println("Digite 2 para area do quadrado");
                        System.out.println("Digite 3 para area do retangulo");
                        System.out.println("Digite 4 para area do losango");
                        System.out.println("Digite 5 para perimetro do triangulo");
                        System.out.println("Digite 6 para perimetro do quadrado");
                        System.out.println("Digite 7 para perimetro do retangulo");
                        System.out.println("Digite 8 para area de um circulo");
                        System.out.print("Escolha uma opção: ");
                        int geometria = Integer.parseInt(ler.nextLine());
                        if (geometria == 1) {
                            System.out.print("Digite o valor de b: ");
                            double b = Double.parseDouble(ler.nextLine());
                            System.out.print("Digite o valor de h: ");
                            double h = Double.parseDouble(ler.nextLine());
                            double area = b * h / (double)2.0F;
                            System.out.println("Area do Triangulo: " + area);
                        } else if (geometria == 2) {
                            System.out.print("Digite o valor de l1: ");
                            double l1 = Double.parseDouble(ler.nextLine());
                            System.out.print("Digite o valor de l2: ");
                            double l2 = Double.parseDouble(ler.nextLine());
                            double area = l1 * l2;
                            System.out.println("Area do quadrado: " + area);
                        } else if (geometria == 3) {
                            System.out.print("Digite o valor de a: ");
                            double a = Double.parseDouble(ler.nextLine());
                            System.out.print("Digite o valor de l1: ");
                            double l1 = Double.parseDouble(ler.nextLine());
                            double area = a * l1;
                            System.out.println("Area do retangulo: " + area);
                        } else if (geometria == 4) {
                            System.out.print("Digite o valor de D: ");
                            double D = Double.parseDouble(ler.nextLine());
                            System.out.print("Digite o valor de d: ");
                            double d = Double.parseDouble(ler.nextLine());
                            double area = D * d / (double)2.0F;
                            System.out.println("Area do losango: " + area);
                        } else if (geometria == 5) {
                            System.out.print("Digite o valor de l1: ");
                            double l1 = Double.parseDouble(ler.nextLine());
                            System.out.print("Digite o valor de l2: ");
                            double l2 = Double.parseDouble(ler.nextLine());
                            System.out.print("Digite o valor de l: ");
                            double l = Double.parseDouble(ler.nextLine());
                            double perimetro = l1 + l2 + l;
                            System.out.println("Perimetro do triangulo: " + perimetro);
                        } else if (geometria == 6) {
                            System.out.print("Digite o valor de l: ");
                            double l = Double.parseDouble(ler.nextLine());
                            double perimetro = (double)4.0F * l;
                            System.out.println("Perimetro do quadrado: " + perimetro);
                        } else if (geometria == 7) {
                            System.out.print("Digite o valor de A: ");
                            double A = Double.parseDouble(ler.nextLine());
                            System.out.print("Digite o valor de l: ");
                            double l = Double.parseDouble(ler.nextLine());
                            double perimetro = (double)2.0F * (A + l);
                            System.out.println("Perimetro do retangulo: " + perimetro);
                        } else if (geometria == 8) {
                            System.out.print("Informe o raio: ");
                            double raio = Double.parseDouble(ler.nextLine());
                            double pi = Math.PI;
                            double area = pi * Math.pow(raio, (double)2.0F);
                            System.out.println("Sua área é: " + area);
                        }
                    } else if (categoria == 2) {
                        System.out.println("___CALCULO__");
                        System.out.println("Digite 1 para bhaskara");
                        System.out.println("Digite 2 para calculo basico");
                        System.out.println("Digite 3 para delta");
                        System.out.print("Escolha uma opção: ");
                        int calculo = Integer.parseInt(ler.nextLine());
                        if (calculo == 1) {
                            System.out.print("Informe o seu A: ");
                            double A = Double.parseDouble(ler.nextLine());
                            System.out.print("Informe o Seu B: ");
                            double B = Double.parseDouble(ler.nextLine());
                            System.out.print("Informe seu C: ");
                            double C = Double.parseDouble(ler.nextLine());
                            double Delta = B * B - (double)4.0F * A * C;
                            System.out.println("O seu Delta é = " + Delta);
                            if (Delta < (double)0.0F) {
                                System.out.println("O delta é negativo, não existem raizes reais.");
                            } else if (Delta == (double)0.0F) {
                                double raiz = (-B + Math.sqrt(Delta)) / ((double)2.0F * A);
                                System.out.println("A sua raiz única é = " + raiz);
                                System.out.println("Não há x2, pois delta = 0.");
                            } else {
                                double x1 = (-B + Math.sqrt(Delta)) / ((double)2.0F * A);
                                double x2 = (-B - Math.sqrt(Delta)) / ((double)2.0F * A);
                                System.out.println("O seu x1 é = " + x1);
                                System.out.println("O seu x2 é = " + x2);
                            }
                        } else if (calculo == 2) {
                            System.out.print("Digite o primeiro número: ");
                            double numero1 = Double.parseDouble(ler.nextLine());
                            System.out.print("Escolha a operação (+, -, *, /): ");
                            String operacao = ler.nextLine();
                            System.out.print("Digite o segundo número: ");
                            double numero2 = Double.parseDouble(ler.nextLine());
                            char op = operacao.charAt(0);
                            switch (op) {
                                case '*':
                                    double result = numero1 * numero2;
                                    System.out.println("Resultado: " + numero1 + " * " + numero2 + " = " + result);
                                    break;
                                case '+':
                                    double resulta = numero1 + numero2;
                                    System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + resulta);
                                    break;
                                case ',':
                                case '.':
                                default:
                                    System.out.println("Operação inválida!");
                                    break;
                                case '-':
                                    double resultad = numero1 - numero2;
                                    System.out.println("Resultado: " + numero1 + " - " + numero2 + " = " + resultad);
                                    break;
                                case '/':
                                    if (numero2 == (double)0.0F) {
                                        System.out.println("Erro: Divisão por zero não é permitida!");
                                    } else {
                                        double resul = numero1 / numero2;
                                        System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + resul);
                                    }
                            }
                        } else if (calculo == 3) {
                            System.out.print("Digite o valor de 'a': ");
                            double a = Double.parseDouble(ler.nextLine());
                            System.out.print("Digite o valor de 'b': ");
                            double b = Double.parseDouble(ler.nextLine());
                            System.out.print("Digite o valor de 'c': ");
                            double c = Double.parseDouble(ler.nextLine());
                            double delta = b * b - (double)4.0F * a * c;
                            System.out.println("-------------------------------------------------------");
                            System.out.println("O valor de a = " + a);
                            System.out.println("O valor de b = " + b);
                            System.out.println("O valor de c = " + c);
                            System.out.println("O Delta (Δ) é: " + delta);
                            System.out.println("-------------------------------------------------------");
                        }
                    } else if (categoria == 3) {
                        System.out.println("___FINANCEIRO__");
                        System.out.println("Digite 1 para PG");
                        System.out.println("Digite 2 para PA");
                        System.out.println("Digite 3 para juros compostos");
                        System.out.println("Digite 4 para juros simples");
                        System.out.print("Digite a opção que voce quer: ");
                        int financeiro = Integer.parseInt(ler.nextLine());
                        if (financeiro == 1) {
                            System.out.print("Digite o primeiro termo (a1): ");
                            double a1 = Double.parseDouble(ler.nextLine());
                            System.out.print("Digite a razão (q): ");
                            double q = Double.parseDouble(ler.nextLine());
                            System.out.print("Digite o número de termos (n): ");
                            int n = Integer.parseInt(ler.nextLine());
                            double Sn = a1 * (Math.pow(q, (double)n) - (double)1.0F) / (q - (double)1.0F);
                            double termN = a1 * Math.pow(q, (double)(n - 1));
                            System.out.println("A soma dos " + n + " primeiros termos da PG é: " + Sn);
                            System.out.println("O termo de posição " + n + " é: " + termN);
                        } else if (financeiro == 2) {
                            System.out.print("Informe o seu primeiro termo: ");
                            double a1 = Double.parseDouble(ler.nextLine());
                            System.out.print("Informe o numero de termos: ");
                            double n = Double.parseDouble(ler.nextLine());
                            System.out.print("Informe a razão: ");
                            double r = Double.parseDouble(ler.nextLine());
                            double Sn = n / (double)2.0F * ((double)2.0F * a1 + (n - (double)1.0F) * r);
                            System.out.println("A soma dos " + (int)n + " primeiros termos da PA é: " + Sn);
                        } else if (financeiro == 3) {
                            System.out.print("Informe a capital inicial: ");
                            double capital = Double.parseDouble(ler.nextLine());
                            System.out.print("Informe a taxa: ");
                            double i = Double.parseDouble(ler.nextLine());
                            System.out.print("Informe o tempo: ");
                            double t = Double.parseDouble(ler.nextLine());
                            double montante = capital * Math.pow((double)1.0F + i / (double)100.0F, t);
                            System.out.println("O juros composto é: " + montante);
                        } else if (financeiro == 4) {
                            System.out.print("Informe a capital inicial: ");
                            double capital = Double.parseDouble(ler.nextLine());
                            System.out.print("Informe a taxa: ");
                            double i = Double.parseDouble(ler.nextLine());
                            System.out.print("Informe o tempo: ");
                            double t = Double.parseDouble(ler.nextLine());
                            double juros = capital * (i / (double)100.0F) * t;
                            System.out.println("O juros é igual a: " + juros);
                        }
                    }
                }
            } while(opt != 0);

            ler.close();
        }
    }