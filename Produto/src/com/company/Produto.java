package br.edu.fatecmm;

public class Produto {

    public long codigo;
    public String nome;
    public String fornecedor;
    public int quantidadeDisp;
    public double preco;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQuantidadeDisp() {
        return quantidadeDisp;
    }

    public void setQuantidadeDisp(int quantidadeDisp) {
        this.quantidadeDisp = quantidadeDisp;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimir(){
        System.out.println("codigo = " + codigo);
        System.out.println("nome = " + nome);
        System.out.println("fornecedor = " + fornecedor);
        System.out.println("quantidadeDisp = " + quantidadeDisp);
        System.out.println("preco = " + preco);

    }

    public boolean entradaDeProduto(int quantidade){
        if(quantidade > 0){
            saldo += quantidade;
            return true;
        }

    }
    public boolean saidaDeProduto(int quantidade) {
        if (quantidade <= saldo) {
            saldo -= quantidade;
            return true;
        }
        return false;
    }
}