package com.gildedrose;

import com.github.larseckart.tcr.FastTestCommitRevertMainExtension;
import com.github.larseckart.tcr.TestCommitRevertExtension;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(TestCommitRevertExtension.class)
//@ExtendWith(FastTestCommitRevertMainExtension.class)
public class GildedRoseTest {

    @Test
    public void foo() {
        String name = "foo";
        GildedRose app = doStuff(name);
        Approvals.verify( app.items[0]);
    }

    private static GildedRose doStuff(String name) {
        Item[] items = new Item[]{new Item(name, 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app;
    }

}
