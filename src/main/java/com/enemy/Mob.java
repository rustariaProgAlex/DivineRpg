package com.enemy;

public class Mob {
    private String name;
    private int hp;
    private int stamina;
    private int mana;
    private int lvl;
    private int critChance;
    private int critDamage;
    private int armor;
    private int damage;
    private String type;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getStamina() {
        return stamina;
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public int getLvl() {
        return lvl;
    }
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    public int getCritChance() {
        return critChance;
    }
    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }
    public int getCritDamage() {
        return critDamage;
    }
    public void setCritDamage(int critDamage) {
        this.critDamage = critDamage;
    }
    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
