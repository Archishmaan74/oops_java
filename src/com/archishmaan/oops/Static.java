package com.archishmaan.oops;

class College{
    String name;
    static String aissce;

    public static void requirementChange(){
        aissce = "ssce";
    }
}

public class Static {
    public static void main(String[] args){
        College.aissce = "YES";
        College col = new College();
        String colname = col.name = "JUET";
        System.out.println("College name: "+ colname);
        System.out.println("Did every student completed their AISSCE: " + College.aissce);
    }
}
