package com.gildedrose;

class GildedRose
{
  Item[] items;
  public GildedRose(Item[] items)
  {
    this.items = items;
  }
  public void updateQuality()
  {
    for (int i = 0; i < items.length; i++)
    {
      Item item = items[i];
      updateQualityForItem(item);
    }
  }
  private void updateQualityForItem(Item item)
  {
    ItemUpdater updaters[] = {new AgedBrie(),
                              new BackstagePasses(),
                              new Sulfuras(),
                              new ConjuredItem(),
                              new DefualtItem()};
    for (ItemUpdater itemUpdater : updaters)
    {
      if (itemUpdater.isItem(item))
      {
        itemUpdater.updateQuality(item);
        return;
      }
    }
  }
}