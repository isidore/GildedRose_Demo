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
        Item[] items = new Item[]{new Item(name, 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Approvals.verify( app.items[0].toString());
    }

}
