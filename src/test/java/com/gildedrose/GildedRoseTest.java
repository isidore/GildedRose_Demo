package com.gildedrose;

import com.github.larseckart.tcr.FastTestCommitRevertMainExtension;
import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(FastTestCommitRevertMainExtension.class)


public class GildedRoseTest {

    @Test
    public void foo() {
        String names[] = {"foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert","Sulfuras, Hand of Ragnaros"};
        Integer qualities[] = {0,-1,1};
        CombinationApprovals.verifyAllCombinations(this::doStuff, names, qualities);
    }

    private String doStuff(String name, Integer quality) {
        Item[] items = new Item[]{new Item(name, 0, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        String result = app.items[0].toString();
        return result;
    }

}
