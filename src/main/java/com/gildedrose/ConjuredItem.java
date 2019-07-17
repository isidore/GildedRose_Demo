package com.gildedrose;

public class ConjuredItem implements ItemUpdater
{
  @Override
  public boolean isItem(Item item)
  {
    return item.name.contains("Conjured");
  }
  @Override
  public void updateQuality(Item item)
  {
    DefualtItem.updateDefaultItemQuality(item, 2);
  }
}
