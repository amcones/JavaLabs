class Stock{
    public String symbol;
    public String name;
    private double prevoiousClosingPrice;
    private double currentPrice;
    Stock(String getsymbol,String getname){
        symbol=getsymbol;
        name=getname;
    }
    double getPrevoiousClosingPrice(){
        return prevoiousClosingPrice;
    }
    double getCurrentPrice(){
        return currentPrice;
    }
    double getChangePercent(){
        return (currentPrice-prevoiousClosingPrice)/prevoiousClosingPrice*100;
    }
    public void setCurrentPrice(double newCurrentPrice){
        currentPrice=newCurrentPrice;
    }
    public void setPrevoiousClosingPrice(double newPreviousClosingPrice){
        prevoiousClosingPrice=newPreviousClosingPrice;
    }
}
public class Lab3 {
    public static void main(String[] args) {
        Stock stk=new Stock("ORCL","Oracle Coporation");
        stk.setPrevoiousClosingPrice(34.5);
        stk.setCurrentPrice(34.35);
        System.out.println("The stock's symbol "+stk.symbol);
        System.out.println("The stock's name "+stk.name);
        System.out.println("The stock's current price "+stk.getCurrentPrice());
        System.out.println("The stock's previous closing price "+stk.getPrevoiousClosingPrice());
        System.out.println("The change percent of the stock is "+stk.getChangePercent()+"%");
    }
}
