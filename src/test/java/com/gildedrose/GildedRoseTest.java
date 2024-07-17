package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//@ExtendWith(TestCommitRevertExtension.class)
//@ExtendWith(FastTestCommitRevertMainExtension.class)
public class GildedRoseTest {

    @Test
    public void foo() {
        String[] names = {"foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros"};
        Integer[] qualities = {0, -1, 1,2,3,5,6,7,49,50,51};
        Integer[] sellIns = {0, -1, 1,2,3,5,6,7,10,11,12};
        CombinationApprovals.verifyAllCombinations(GildedRoseTest::doStuff, names, qualities, sellIns);
    }

    private static String doStuff(String name, Integer quality, Integer sellIn) {
        Item[] items = new Item[]{new Item(name, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        String result = app.items[0].toString();
        return result;
    }

}
