package com.factoriaf5.kata;

public final class App {
    private App() {
    }

    public static void main(String[] args) {


        Character ironMan=new Character("IronMan");
        Character thanos=new Character("thanos");

        System.out.println("//=================================START=================================\\");

        System.out.println("Iron Man health:"+ironMan.getHealth());
        System.out.println("Thanos health:"+thanos.getHealth());

        System.out.println("//================================Round 1================================\\");

        System.out.println("Iron Man makes 500 DP to thanos");
        ironMan.dealDamage(thanos, 500);
        System.out.println("Iron Man health:"+ironMan.getHealth());
        System.out.println("Thanos health:"+thanos.getHealth());

        System.out.println("//================================Round 2================================\\");

        System.out.println("Iron Man heals thanos with 50 HP");
        ironMan.heal(thanos, 50);
        System.out.println("Iron Man health:"+ironMan.getHealth());
        System.out.println("Thanos health:"+thanos.getHealth());

        System.out.println("//================================Round 3================================\\");
        
        System.out.println("Thanos snapped his fingers...");
        thanos.dealDamage(ironMan, 1500);
        System.out.println("Iron Man health:"+ironMan.getHealth());
        System.out.println("Thanos health:"+thanos.getHealth());

        System.out.println("//================================Round 4================================\\");

        System.out.println("Avengers try to save Iron Man but...");
        thanos.heal(ironMan, 50);
        System.out.println("Iron Man health:"+ironMan.getHealth());
        System.out.println("Thanos health:"+thanos.getHealth());

        System.out.println("//================================ENDGAME================================\\");


    }
}

