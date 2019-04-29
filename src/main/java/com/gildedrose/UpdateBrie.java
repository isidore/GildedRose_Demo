package com.gildedrose;

public class UpdateBrie implements Updater
{
  public UpdateBrie()
  {
    super();
  }
  /* (non-Javadoc)
   * @see com.gildedrose.Updater#isItem(com.gildedrose.Item)
   */
  @Override
  public boolean isItem(Item item)
  {
    return item.name.equals("Aged Brie");
  }
  /* (non-Javadoc)
   * @see com.gildedrose.Updater#update(com.gildedrose.Item)
   */
  @Override
  public void update(Item item)
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