package org.example.lesson3;

public class Notebook /* implements Comparable<Notebook>*/  {

    private final String company;
    private final int ram;
    private final double price;

    public Notebook(String company, int ram, double price) {
        this.company = company;
        this.ram = ram;
        this.price = price;
    }
    
    public String getCompany(){
        return company;
    }

    public int getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }
    
    // 1.1
    // @Override
    // public int compareTo(Notebook o) {
    //     return this.getRam() - o.getRam();
    // }

    // 1.2
    // @Override
    // public int compareTo(Notebook o) {
    //     return (int)this.getPrice() - (int)o.getPrice();
    // }

    // 1.3 
    // @Override
    // public int compareTo(Notebook o) {
    //     if (this.getRam() - o.getRam() != 0) {
    //         return this.getRam() - o.getRam();
    //     }
    //     else{
    //         return (int)this.getPrice() - (int)o.getPrice();
    //     }
    // }

}
