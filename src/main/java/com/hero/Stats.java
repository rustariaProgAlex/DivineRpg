package com.hero;

public class Stats {
    public static void defaultStats() {
        Player.setMaxHp(100);
        Player.setHp(Player.getMaxHp());
        Player.setMaxMana(0);
        Player.setMana(Player.getMaxMana());
        Player.setMaxStamina(100);
        Player.setStamina(Player.getMaxStamina());
        Player.setArmor(0);
        Player.setDamage(0);
        Player.setSkillPoints(5);
    }
}
