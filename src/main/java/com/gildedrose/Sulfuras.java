package com.gildedrose;

public class Sulfuras implements ItemUpdater
{
  public Sulfuras()
  {
    super();
  }
  public boolean isItem(Item item)
  {
    return item.name.equals("Sulfuras, Hand of Ragnaros");
  }
  public void updateQuality(Item item)
  {
    // TODO Auto-generated method stub
  }
}