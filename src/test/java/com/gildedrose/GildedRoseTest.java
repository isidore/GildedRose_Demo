package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//@ExtendWith(TestCommitRevertExtension.class)
//@ExtendWith(FastTestCommitRevertMainExtension.class)
public class GildedRoseTest {

    @Test
    public void foo() {
        String[] names = {"foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert"};
        Integer[] qualities = {0};
        CombinationApprovals.verifyAllCombinations(GildedRoseTest::doStuff, names, qualities);
    }

    private static String doStuff(String name, Integer quality) {
        Item[] items = new Item[]{new Item(name, 0, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        String result = app.items[0].toString();
        return result;
    }

}
