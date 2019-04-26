package com.gildedrose;

public class UpdateConjured implements ItemUpdater
{
  public UpdateConjured()
  {
    super();
  }
  public boolean isType(Item item)
  {
    return item.name.contains("Conjured");
  }
  public void updateItem(Item item)
  {
    int rate = 2;
    UpdateDefault.updateNormalItem(item, rate);
  }
}