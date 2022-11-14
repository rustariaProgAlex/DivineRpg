package com.hero;

public class Stats {
    public static void defaultStats() {
        Player.setMaxHp(30);
        Player.setHp(Player.getMaxHp());
        Player.setMaxMana(0);
        Player.setMana(Player.getMaxMana());
        Player.setMaxStamina(100);
        Player.setStamina(Player.getMaxStamina());
        Player.setArmor(0);
        Player.setDamage(1);
        Player.setCritDamage(1);
        Player.setCritChance(0);
        Player.setSkillPoints(5);
    }
}
