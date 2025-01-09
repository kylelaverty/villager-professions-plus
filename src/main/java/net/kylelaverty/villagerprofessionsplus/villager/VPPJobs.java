package net.kylelaverty.villagerprofessionsplus.villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.kylelaverty.villagerprofessionsplus.VillagerProfessionsPlusMod;
import net.kylelaverty.villagerprofessionsplus.util.VPPReference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;

public class VPPJobs {

    private static void registerNetherographerJobs(){
        TradeOfferHelper.registerVillagerOffers(
                VPPVillagers.NETHEROGRAPHER,
                TradeLevel.NOVICE,
                factories -> {
                    factories.add(new EmeraldToItemOffer(new ItemStack(Items.WARPED_FUNGUS, 4), 1, 12, 1, 0.2f));
                    factories.add(new EmeraldToItemOffer(new ItemStack(Items.CRIMSON_FUNGUS, 4), 1, 12, 1, 0.2f));
                    factories.add(new ItemToEmeraldOffer(new ItemStack(Items.STONE_PICKAXE, 1), 1, 12, 1, 0.02f));
                    factories.add(new ItemToEmeraldOffer(new ItemStack(Items.IRON_PICKAXE, 1), 2, 12, 1, 0.02f));
                    factories.add(new ItemToEmeraldOffer(new ItemStack(Items.STONE_SHOVEL, 1), 1, 12, 1, 0.02f));
                    factories.add(new ItemToEmeraldOffer(new ItemStack(Items.IRON_SHOVEL, 1), 2, 12, 1, 0.02f));
                    factories.add(new ItemToEmeraldOffer(new ItemStack(Items.CARROT, 20), 1, 12, 1, 0.02f));
                    factories.add(new ItemToEmeraldOffer(new ItemStack(Items.BREAD, 4), 1, 12, 1, 0.02f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(
                VPPVillagers.NETHEROGRAPHER,
                TradeLevel.APPRENTICE,
                factories -> {
                    factories.add(new EmeraldToItemOffer(new ItemStack(Items.BASALT, 1), 1, 16, 5, 0.2f));
                    factories.add(new EmeraldToItemOffer(new ItemStack(Items.NETHER_WART, 4), 1, 16, 5, 0.2f));
                    factories.add(new EmeraldToItemOffer(new ItemStack(Items.TWISTING_VINES, 4), 1, 16, 5, 0.2f));
                    factories.add(new EmeraldToItemOffer(new ItemStack(Items.WEEPING_VINES, 4), 1, 16, 5, 0.2f));
                    factories.add(new ItemToEmeraldOffer(new ItemStack(Items.LADDER, 10), 1, 16, 5, 0.02f));
                    factories.add(new ItemToEmeraldOffer(new ItemStack(Items.SOUL_LANTERN, 4), 5, 16, 5, 0.02f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(
                VPPVillagers.NETHEROGRAPHER,
                TradeLevel.JOURNEYMAN,
                factories -> {
                    factories.add(new EmeraldToItemOffer(new ItemStack(Items.SHROOMLIGHT, 1), 1, 12, 10, 0.2f));
                    factories.add(new EmeraldToItemOffer(new ItemStack(Items.GLOWSTONE, 1), 2, 12, 10, 0.2f));
                    factories.add(new ItemToEmeraldOffer(new ItemStack(Items.SOUL_CAMPFIRE, 4), 6, 12, 10, 0.02f));
                    factories.add(new ItemToEmeraldOffer(new ItemStack(Items.DIAMOND_PICKAXE, 1), 10, 12, 10, 0.02f));
                    factories.add(new ItemToEmeraldOffer(new ItemStack(Items.DIAMOND_SHOVEL, 1), 10, 12, 10, 0.02f));
                    factories.add(new ItemToEmeraldOffer(new ItemStack(Items.WARPED_FUNGUS_ON_A_STICK, 1), 15, 6, 10, 0.02f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(
                VPPVillagers.NETHEROGRAPHER,
                TradeLevel.EXPERT,
                factories -> {
                    factories.add(new EmeraldToItemOffer(new ItemStack(Items.CRYING_OBSIDIAN, 1), 2, 12, 15, 0.2f));
                    factories.add(new EmeraldToItemOffer(new ItemStack(Items.MAGMA_BLOCK, 1), 2, 12, 15, 0.2f));
                    factories.add(new EmeraldToItemOffer(new ItemStack(Items.SOUL_SAND, 1), 2, 12, 15, 0.2f));
                    factories.add(new EmeraldToItemOffer(new ItemStack(Items.SOUL_SOIL, 1), 2, 12, 15, 0.2f));
                    factories.add(new EmeraldToItemOffer(new ItemStack(Items.RAW_GOLD, 1), 4, 12, 15, 0.2f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(
                VPPVillagers.NETHEROGRAPHER,
                TradeLevel.MASTER,
                factories -> {
                    factories.add(new EmeraldToItemOffer(new ItemStack(Items.RESPAWN_ANCHOR, 1), 64, 2, 30, 0.02f));
                    factories.add(new EmeraldToItemOffer(new ItemStack(Items.GILDED_BLACKSTONE, 1), 64, 2, 30, 0.02f));
                }
        );
    }

    private static final class TradeLevel {
        public static final int NOVICE = 1;
        public static final int APPRENTICE = 2;
        public static final int JOURNEYMAN = 3;
        public static final int EXPERT = 4;
        public static final int MASTER = 5;
    }

    private static final class EmeraldToItemOffer implements TradeOffers.Factory {

        private final ItemStack sell;
        private final int price;
        private final int maxUses;
        private final int experience;
        private final float multiplier;

        /**
         * @param stack The item and how many of them will be given to the player.
         * @param price The number of emeralds this trade will cost.
         * @param maxUses The number of uses of this trade before being exhausted.
         * @param experience The amount of experience given for this trade.
         * @param multiplier The price multiplier for repeated trades.
         */
        public EmeraldToItemOffer(ItemStack stack, int price, int maxUses, int experience, float multiplier) {
            this.sell = stack;
            this.price = price;
            this.maxUses = maxUses;
            this.experience = experience;
            this.multiplier = multiplier;
        }

        public TradeOffer create(Entity entity, Random random) {
            return new TradeOffer(new ItemStack(Items.EMERALD, this.price), this.sell, this.maxUses, this.experience, this.multiplier);
        }
    }

    private static final class ItemToEmeraldOffer implements TradeOffers.Factory {

        private final ItemStack buy;
        private final int price;
        private final int maxUses;
        private final int experience;
        private final float multiplier;

        /**
         * @param stack The item and how many of them will be bought from the player.
         * @param price The number of emeralds this trade will cost.
         * @param maxUses The number of uses of this trade before being exhausted.
         * @param experience The amount of experience given for this trade.
         * @param multiplier The price multiplier for repeated trades.
         */
        public ItemToEmeraldOffer(ItemStack stack, int price, int maxUses, int experience, float multiplier) {
            this.buy = stack;
            this.price = price;
            this.maxUses = maxUses;
            this.experience = experience;
            this.multiplier = multiplier;
        }

        public TradeOffer create(Entity entity, Random random) {
            return new TradeOffer(this.buy, new ItemStack(Items.EMERALD, this.price), this.maxUses, this.experience, this.multiplier);
        }
    }

    public static void registerTrades(){
        VillagerProfessionsPlusMod.LOGGER.info("Registering Jobs for " + VPPReference.MOD_ID);

        registerNetherographerJobs();
    }
}
