package appmaquinacafe;

public class MaquinaCafe 
{
    private double preco;
    private int totcafesvendidos;
    private double totfaturado;
    private double acvalorinserido;
  
    public double getPreco()
    {  return preco;
    }
    public double getAcValorInserido()
    {
        return acvalorinserido;
    }
    public void setPreco(double preco)
    {
        if(preco>=0)
            this.preco=preco;
    }

    public void iniciarNovaVenda(double preco)
    {
        this.setPreco(preco);
    }
    //sobrecarga ou overload
    public void iniciarNovaVenda()
    {
        this.preco=1.25;
    }
    public boolean receberMoeda(double moeda)
    {
        if (moeda >0 && validaMoeda(moeda) )
        {  acvalorinserido+=moeda;
           return true;
        }
        return false;        
    }
    private boolean validaMoeda(double moeda)
    {
        double[] moedas={1, 0.5, 0.25, 0.1, 0.05};
        for (double m : moedas)
            if (moeda==m)
                return true;
        return false;
    }
    public boolean valorSuficiente()
    {
        return acvalorinserido >= preco;
    }
    public double devolverTroco()
    {   double troco = acvalorinserido - preco;
        totcafesvendidos++;
        totfaturado+=preco;
        acvalorinserido=0;
        return troco;
    }
    public double getTotFaturado()
    {
        return totfaturado;
    }
    public int getTotalCafesVendidos()
    {
        return totcafesvendidos;
    }
}
