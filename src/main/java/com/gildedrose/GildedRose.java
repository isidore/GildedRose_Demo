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
      stuff(item);
    }
  }
  private void stuff(Item item)
  {
    AgedBrie agedBrie = new AgedBrie();
    BackstagePasses passes = new BackstagePasses();
    Sulfuras sulfuras = new Sulfuras();
    DefualtItem defaultItem = new DefualtItem();
    if (agedBrie.isItem(item))
    {
      agedBrie.stuffWithAgedBrie(item);
      return;
    }
    else if (passes.isItem(item))
    {
      passes.doStuffForBackstagePasses(item);
      return;
    }
    else if (sulfuras.isItem(item))
    {
      sulfuras.doStuffForSulfuras(item);
      return;
    }
    else if (defaultItem.isItem())
    {
      defaultItem.doStuffForEverythingElse(item);
      return;
    }
  }
}