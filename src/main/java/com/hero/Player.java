package com.hero;

public class Player{
private static int hp;
private static int stamina;
private static int mana;

private static int maxHp;
private static int maxStamina;
private static int maxMana;

private static int armor;
private static int damage;
  
private static int lucky;
private static int critDamage;
private static int critChance;
  
private static int skillPoints;
private static int lvl;
  
private static int STR;
private static int DEX;
private static int MAG;

public static int getHp() {
    return hp;
}
public static void setHp(int hp) {
    Player.hp = hp;
}
public static int getStamina() {
    return stamina;
}
public static void setStamina(int stamina) {
    Player.stamina = stamina;
}
public static int getMana() {
    return mana;
}
public static void setMana(int mana) {
    Player.mana = mana;
}
public static int getArmor() {
    return armor;
}
public static void setArmor(int armor) {
    Player.armor = armor;
}
public static int getDamage() {
    return damage;
}
public static void setDamage(int damage) {
    Player.damage = damage;

}
public static int getLucky() {
    return lucky;
}
public static void setLucky(int lucky) {
    Player.lucky = lucky;
}
public static int getCritChance() {
    return critChance;
}
public static void setCritChance(int critChance) {
    Player.critChance = critChance;
}
public static int getCritDamage() {
    return critDamage;
}
public static void setCritDamage(int critDamage) {
    Player.critDamage = critDamage;
}
public static int getSkillPoints() {
    return skillPoints;
}
public static void setSkillPoints(int skillPoints) {
    Player.skillPoints = skillPoints;
}
public static int getLvl() {
    return lvl;
}
public static void setLvl(int lvl) {
    Player.lvl = lvl;
}
public static int getSTR() {
    return STR;
}
public static void setSTR(int sTR) {
    Player.damage += 3;
    Player.maxHp += 5;
    STR = sTR;
}
public static int getDEX() {
    return DEX;
}
public static void setDEX(int dEX) {
    DEX = dEX;
}
public static int getMAG() {
    return MAG;
}
public static void setMAG(int mAG) {
    MAG = mAG;
}

public static int getMaxHp() {
    return Player.maxHp;
}

public static void setMaxHp(int maxHp) {
    Player.maxHp = maxHp;
}

public static int getMaxMana() {
    return maxMana;
}
public static void setMaxMana(int maxMana) {
    Player.maxMana = maxMana;
}
public static int getMaxStamina() {
    return maxStamina;
}
public static void setMaxStamina(int maxStamina) {
    Player.maxStamina = maxStamina;
}
}
