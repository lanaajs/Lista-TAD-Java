package questao12;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Compra {
    
    private Date data;
    private List<String> itens;
    private double valorTotal;

    public Compra(Date dataCompra, List<String> itens, double valorTotal) {
        this.data = dataCompra;
        this.itens = itens;
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<String> getItens() {
        return itens;
    }

    public void setItens(List<String> itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Compra [data=" + sdf.format(data) + ", itens=" + itens + ", valorTotal=" + valorTotal + "]";
    }
}
