package com.gamingmesh.jobs.container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.Items.CMIAsyncHead;
import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Items.CMIMaterial;

public class ShopItem {

    private double pointPrice = 0D;
    private double vaultPrice = 0D;

    private int slot = -1;
    private int page = -1;

    private String nodeName;

    private boolean hideWithoutPerm = false;
    private boolean hideNoEnoughPoint = false;

    private int requiredTotalLevels = -1;

    private Map<String, Integer> requiredJobs = new HashMap<>();

//    private final List<String> iconLore = new ArrayList<>();
    private final List<String> requiredPerm = new ArrayList<>();
    private final List<String> commands = new ArrayList<>();
    private final List<JobItems> items = new ArrayList<>();

//    private String playerName;
//    private boolean useCurrentPlayer = false;

    private String iconString;

    public CMIItemStack getIcon(Player player, CMIAsyncHead ahead) {
        CMIItemStack stack = CMIItemStack.deserialize(iconString.replace("[player]", player.getName()), ahead);
        return stack == null ? CMIMaterial.STONE.newCMIItemStack() : stack;
    }

    public ShopItem(String nodeName) {
        this.nodeName = nodeName;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public int getSlot() {
        return slot;
    }

    public void setitems(List<JobItems> items) {
        this.items.clear();

        if (items != null)
            this.items.addAll(items);
    }

    public List<JobItems> getitems() {
        return items;
    }

    public void setCommands(List<String> commands) {
        this.commands.clear();

        if (commands != null)
            this.commands.addAll(commands);
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setRequiredJobs(Map<String, Integer> requiredJobs) {
        this.requiredJobs = requiredJobs;
    }

    public Map<String, Integer> getRequiredJobs() {
        return requiredJobs;
    }

    public void setRequiredPerm(List<String> requiredPerm) {
        this.requiredPerm.clear();

        if (requiredPerm != null)
            this.requiredPerm.addAll(requiredPerm);
    }

    public List<String> getRequiredPerm() {
        return requiredPerm;
    }

    public void setHideIfThereIsNoEnoughPoints(boolean hideNoEnoughPoint) {
        this.hideNoEnoughPoint = hideNoEnoughPoint;
    }

    public boolean isHideIfNoEnoughPoints() {
        return hideNoEnoughPoint;
    }

    public void setHideWithoutPerm(boolean hideWithoutPerm) {
        this.hideWithoutPerm = hideWithoutPerm;
    }

    public boolean isHideWithoutPerm() {
        return hideWithoutPerm;
    }

//    public void setIconLore(List<String> iconLore) {
//        this.iconLore.clear();
//
//        if (iconLore != null)
//            this.iconLore.addAll(iconLore);
//    }
//
//    public List<String> getIconLore() {
//        return iconLore;
//    }

    public String getNodeName() {
        return nodeName;
    }

//    public String getIconMaterial() {
//        return iconMaterial;
//    }
//
//    public void setIconMaterial(String iconMaterial) {
//        this.iconMaterial = iconMaterial;
//    }

    @Deprecated
    public double getPrice() {
        return getPointPrice();
    }

    public double getPointPrice() {
        return pointPrice;
    }

//    public void setIconAmount(int iconAmount) {
//        this.iconAmount = iconAmount;
//    }
//
//    public int getIconAmount() {
//        return iconAmount;
//    }
//
//    public void setIconName(String iconName) {
//        this.iconName = iconName;
//    }
//
//    public String getIconName() {
//        return iconName;
//    }

    public int getRequiredTotalLevels() {
        return requiredTotalLevels;
    }

    public void setRequiredTotalLevels(int requiredTotalLevels) {
        this.requiredTotalLevels = requiredTotalLevels;
    }

//    public String getCustomHead() {
//        return playerName;
//    }
//
//    public void setCustomHead(String playerName) {
//        this.playerName = playerName;
//    }
//
//    public boolean isHeadOwner() {
//        return useCurrentPlayer;
//    }
//
//    public void setCustomHeadOwner(boolean useCurrentPlayer) {
//        this.useCurrentPlayer = useCurrentPlayer;
//    }

    public double getVaultPrice() {
        return vaultPrice;
    }

    public void setVaultPrice(double currencyPrice) {
        this.vaultPrice = currencyPrice;
    }

    public void setPointPrice(double pointPrice) {
        this.pointPrice = pointPrice;
    }

    public String getIconString() {
        return iconString;
    }

    public void setIconString(String iconString) {
        this.iconString = iconString;
    }
}
