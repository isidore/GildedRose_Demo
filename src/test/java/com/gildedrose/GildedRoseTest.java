package com.gildedrose;

import com.github.larseckart.tcr.FastTestCommitRevertMainExtension;
import com.github.larseckart.tcr.TestCommitRevertExtension;
import org.approvaltests.Approvals;
import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
//@ExtendWith(TestCommitRevertExtension.class)
//@ExtendWith(FastTestCommitRevertMainExtension.class)
public class GildedRoseTest {

    @Test
    public void foo() {
        String[] names = {"foo"};
        CombinationApprovals.verifyAllCombinations(GildedRoseTest::doStuff, names);
    }

    private static String doStuff(String name) {
        Item[] items = new Item[]{new Item(name, 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        String result = app.items[0].toString();
        return result;
    }

}
