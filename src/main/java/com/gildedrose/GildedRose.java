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
    ItemUpdater updaters[] = {new AgedBrie()};
    ItemUpdater passes = new BackstagePasses();
    ItemUpdater sulfuras = new Sulfuras();
    ItemUpdater defaultItem = new DefualtItem();
    for (ItemUpdater itemUpdater : updaters)
    {
      if (itemUpdater.isItem(item))
      {
        itemUpdater.updateQuality(item);
        return;
      }
    }
    if (passes.isItem(item))
    {
      passes.updateQuality(item);
      return;
    }
    else if (sulfuras.isItem(item))
    {
      sulfuras.updateQuality(item);
      return;
    }
    else if (defaultItem.isItem(item))
    {
      defaultItem.updateQuality(item);
      return;
    }
  }
}