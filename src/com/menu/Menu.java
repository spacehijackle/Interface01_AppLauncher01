package com.menu;

import java.util.ArrayList;
import java.util.List;

import com.launcher.AppLauncher;

/**
 * メニュークラス
 *
 * @author t.yoshida
 */
public class Menu
{
	// メニュー項目リスト
	private List<MenuItem> _items;

	/**
	 * メニューを生成する。
	 */
	public Menu()
	{
		_items = new ArrayList<>();
	}

	/**
	 * メニュー項目を追加する。
	 *
	 * @param itemName メニュー項目名
	 * @param launcher アプリランチャー
	 */
	public void add(String itemName, AppLauncher launcher)
	{
		// 項目番号を設定してリストに追加
		int itemNo = _items.size() + 1;
		_items.add(new MenuItem(itemNo, itemName, launcher));
	}

	/**
	 * メニュー項目リストを返す。
	 *
	 * @return メニュー項目リスト
	 */
	public List<MenuItem> items()
	{
		return (new ArrayList<>(_items));
	}

	/**
	 * 入力されたメニュー項目番号に対応するメニュー項目を返す。
	 *
	 * @param inputItemNo 入力されたメニュー項目番号
	 * @return メニュー項目（該当するメニュー項目がない場合、null）
	 */
	public MenuItem select(String inputItemNo)
	{
		MenuItem selected = null;
		try
		{
			int itemNo = Integer.parseInt(inputItemNo);

			for(MenuItem item : _items)
			{
				if(itemNo == item.getNo())
				{
					if(item.isAvailable())
					{
						selected = item;
					}
					break;
				}
			}
		}
		catch(NumberFormatException ex) { }

		return selected;
	}
}
