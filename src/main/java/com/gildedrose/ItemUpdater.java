package com.gildedrose;

public interface ItemUpdater
{
  boolean isType(Item item);
  void updateItem(Item item);
}