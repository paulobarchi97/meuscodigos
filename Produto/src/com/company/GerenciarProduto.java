package br.edu.fatecmm

        import javax.swing.plaf.synth.SynthOptionPaneUI;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

        public class GerenciarProduto {

            public Produto p1 = new Produto();

            public static void main(String[] args) {

                //Autores do projeto: Paulo Fábio e Paulo Barchielli

                //Criação do MENU para escolha das ações a serem tomadas
                //Faremos um Laço (loop)


                Scanner input = new Scanner(System.in);
                GerenciarProduto gp = new GerenciarProduto();
                int opc=0;

                do{
                    System.out.println("1 - Cadastrar Produto");
                    System.out.println("2 - Entrada de Produto");
                    System.out.println("3 - Saída de Produto");
                    System.out.println("4 - Bonificar Produto");
                    System.out.println("5 - Consultar");
                    System.out.println("9 - Sair");
                    System.out.println("Escolha uma das opções:");
                    opc = Integer.parseInt(input.nextLine());

                    switch (opc){

                        case 1:
                            gp.cadastrarProduto();
                            break;
                        case 2:
                            gp.entrada();
                            break;
                        case 3:
                            gp.saida();
                            break;
                        case 4:
                            gp.bonificar();
                            break;
                        case 5:
                            gp.consultar();
                            break;
                        case 9:
                            System.out.println("Fim");
                            break;
                        default:
                            System.out.printf("Opção Inválida!");
                    }
                } while (opc!=9);
            }

            public void cadastrarProduto(){
                Produto p1 = new Produto();
                Scanner input = new Scanner(System.in);
                System.out.println("Cadastro de Produto");
                System.out.println("Digite o código do Produto: ");
                p1.setCodigo(Integer.parseInt(input.nextLine()));
                System.out.printf("Digite o Nome do Produto: ");
                p1.setNome(input.nextLine());
                System.out.println("Digite o Fornecedor do Produto: ");
                p1.setFornecedor(input.nextLine());
                System.out.println("Digite a Quantidade Disponível do Produto");
                p1.setQuantidadeDisp(Double.parseDouble(input.nextLine()));
                System.out.println("Produto Cadastrado com Sucesso!");
                System.out.println();
            }

            public void entrada(){
                Scanner input = new Scanner(System.in);
                System.out.println("Digite o código do Produto: ");
                long codigo = Long.parseLong(input.nextLine());
                for(Produto p: p1){
                    if(codigo == p.getCodigo()){
                        System.out.println("Digite a quantidade de entrada");
                        int qtd = Integer.parseInt(input.nextLine());
                        if(p.entradaDeProduto(qtd)){
                            System.out.println("Entrada efetuada com sucesso!");
                        }else{
                            System.out.println("Quantidade inválida!");
                        }
                    }
                }
            }

            public void saida(){
                Scanner input = new Scanner(System.in);
                System.out.println("Digite o código do Produto: ");
                int idProcurado = Integer.parseInt(input.nextLine());
                for(Produto p: p1){
                    if(Codigo == p.getCodigo()){
                        System.out.println("Digite a quantidade de saída: ");
                        int qtd = Integer.parseInt(input.nextLine());
                        if(p.saidaDeProduto(qtd)){
                            System.out.println("Baixa efetuada com sucesso!");
                        }else{
                            System.out.println("Quantidade indisponível!");
                        }
                    }
                }

            }



















}