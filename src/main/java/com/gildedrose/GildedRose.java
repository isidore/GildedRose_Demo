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
      updateQuality(item);
    }
  }
  public void updateQuality(Item item)
  {
    ItemUpdater updaters[] = {new UpdateBrie(),
                              new UpdateBackstagePasses(),
                              new UpdateSulfuras(),
                              new UpdateDefault()};
    for (ItemUpdater itemUpdater : updaters)
    {
      if (itemUpdater.isType(item))
      {
        itemUpdater.updateItem(item);
        return;
      }
    }
  }
}
