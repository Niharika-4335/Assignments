package Streams;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Long.sum;

class Transaction{
    String date;
    Integer amount;
   boolean status;

    public Transaction(String date, Integer amount,boolean status) {
        this.date = date;
        this.amount = amount;
        this.status=status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public String toString(){
        return date+" "+amount+" "+status;
    }

}
public class TransactionSum {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100,true),
                new Transaction("2022-01-01", 200,false),
                new Transaction("2022-01-02", 300,false),
                new Transaction("2022-01-02", 400,true),
                new Transaction("2022-01-03", 500,true)
        );
        Map<String,Integer> hashMap=new HashMap<>();
       hashMap=transactions.stream().collect(Collectors.groupingBy(Transaction::getDate,
               Collectors.summingInt(Transaction::getAmount)));//Collectors provide many utility functions
        System.out.println(hashMap);

        Map<Boolean,List<Transaction>> transaction=transactions.stream().collect(Collectors.partitioningBy(i->i.getStatus()));
        List<Transaction> list=transaction.get(true);
        List<Transaction> list1=transaction.get(false);
        System.out.println(list);
        System.out.println(list1);

        System.out.println(transactions.stream().map(i->i.getAmount()).reduce(0,Integer::sum));


    }
}
