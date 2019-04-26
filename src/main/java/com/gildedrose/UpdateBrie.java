package com.gildedrose;

public class UpdateBrie implements ItemUpdater
{
  public UpdateBrie()
  {
    super();
  }

  /* (non-Javadoc)
   * @see com.gildedrose.ItemUpdater#isType(com.gildedrose.Item)
   */
  @Override
  public boolean isType(Item item)
  {
    return item.name.equals("Aged Brie");
  }

  /* (non-Javadoc)
   * @see com.gildedrose.ItemUpdater#updateItem(com.gildedrose.Item)
   */
  @Override
  public void updateItem(Item item)
  {
    if (item.quality < 50)
    {
      item.quality = item.quality + 1;
    }
    item.sellIn = item.sellIn - 1;
    if (item.sellIn < 0)
    {
      if (item.quality < 50)
      {
        item.quality = item.quality + 1;
      }
    }
    return;
  }
}