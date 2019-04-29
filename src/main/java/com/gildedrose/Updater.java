package com.gildedrose;

public interface Updater
{
  boolean isItem(Item item);
  void update(Item item);
}