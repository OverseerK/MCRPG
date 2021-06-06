package com.overseer;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

public final class MCRPG extends JavaPlugin implements Listener {

    Scoreboard Board = Bukkit.getScoreboardManager().getMainScoreboard();
    Objective HP = Board.getObjective("Health");
    Objective Str = Board.getObjective("Strength");
    Objective Int = Board.getObjective("Strength");

    public void getScore(Player p, Objective o) {
        o.getScore(p);
    }

    @Override
    public void onEnable() {
        System.out.println("[MCRPG] 활성화됨.");
    }

    @Override
    public void onDisable() {
        System.out.println("[MCRPG] 비활성화됨.");
    }

    @EventHandler
    public void onFirstJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (p.hasPlayedBefore()) return;
        e.setJoinMessage(p.getName() + "님이 서버에 처음 접속하셨습니다!");

    }
}